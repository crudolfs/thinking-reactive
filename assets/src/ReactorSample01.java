import reactor.core.publisher.Flux;

// create Publisher
Flux<String> words = Flux.just("Java", "Kotlin", 
							   "C#", "JavaScript");

// apply operators
words.filter(word -> word.contains("Java"))
	 .map(String::toLowerCase)
	 .subscribe(LOG::info);