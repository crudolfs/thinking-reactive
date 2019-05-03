import io.reactivex.Observable;

// DO NOT CREATE THREADS LIKE THIS: 
// instead use observeOn and subscribeOn
Observable<String> a = Observable.create(s -> {
    new Thread(() -> {
        s.onNext("one");
        s.onNext("two");
        s.onComplete();
    }).start();
});

Observable<String> b = Observable.create(s -> {
    new Thread(() -> {
        s.onNext("three");
        s.onNext("four");
        s.onComplete();
    }).start();
});

// this subscribes to a and b concurrently,
// and merges into a third sequential stream
Observable<String> c = Observable.merge(a, b);

c.subscribe(event -> LOG.info("{}", event));

// output:
// - 'one' will appear before 'two'
// - 'three' will appear before 'four'
// - the order between 'one'/'two' and 'three'/'four' is unspecified