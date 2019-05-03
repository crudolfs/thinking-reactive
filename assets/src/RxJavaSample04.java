import io.reactivex.Observable;

// Observable defaults to being synchronous
Observable.create(emitter -> {
    emitter.onNext("EVENT 1");
}).subscribe(event -> LOG.info("{}", event));