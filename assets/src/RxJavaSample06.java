import io.reactivex.Observable;

// DO NOT DO THIS: onNext is invoked concurrently
Observable<String> observable =
    Observable.create(emitter -> {
        // Thread A
        new Thread(() -> {
            emitter.onNext("one");
            emitter.onNext("two");
        }).start();
        // Thread B
        new Thread(() -> {
            emitter.onNext("three");
            emmitter.onNext("four");
        }).start();

        // ignoring need to emit s.onCompleted() due to race of threads
    });