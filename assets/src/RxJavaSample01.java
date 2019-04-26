import io.reactivex.Flowable;

// create Publisher
Flowable<String> words = Flowable.just("Java", "Kotlin", 
									   "C#", "JavaScript");

// apply operators
words.filter(word -> word.contains("Java"))
		.map(String::toLowerCase)
		.subscribe(LOG::info);