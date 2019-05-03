import io.reactivex.Flowable;

// create Publisher
Flowable<String> words = Flowable.just("Java", "Kotlin", 
									   "C#", "JavaScript");

// apply operators
words.filter(word -> word.contains("Java"))
     .map(word -> word.toLowerCase())
     .subscribe(word -> LOG.info("onNext: {}", word),
        throwable -> LOG.error("onError: {}", throwable),
        () -> LOG.info("onCompleted"));