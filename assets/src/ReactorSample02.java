import reactor.core.publisher.Flux;

// create Publisher
Flux<String> words = Flux.just("Java", "Kotlin", 
							   "C#", "JavaScript");

// apply operators
words.filter(wordEvent -> wordEvent.contains("Java"))
     .map(wordEvent -> wordEvent.toLowerCase())
     .subscribe(wordEvent -> LOG.info("onNext: {}", wordEvent),
                throwable -> LOG.error("onError: {}", throwable),
                () -> LOG.info("onCompleted"));