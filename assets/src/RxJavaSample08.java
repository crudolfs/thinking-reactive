import io.reactivex.Flowable;

// create stream of even integers
Flowable<Integer> evens = Flowable.range(1, 10)
        .filter(i -> i % 2 == 0);

// subscription 1
evens.subscribe(i -> LOG.info("1 onNext: {}", i));

// subscription 2
evens.subscribe(i -> LOG.info("2 onNext: {}", i));