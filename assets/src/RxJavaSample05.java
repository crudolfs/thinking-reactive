import io.reactivex.Observable;

// Observable defaults to being synchronous
Observable<Integer> observable = Observable.create(emitter -> {
    emitter.onNext(1);
    emitter.onNext(2);
    emitter.onNext(3);
    emitter.onComplete();
});

// operator defaults to being synchronous
observable.map(i -> "Number " + i)
        .subscribe(event -> LOG.info("{}", event));