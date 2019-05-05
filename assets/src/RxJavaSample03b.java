Observable.just(8, 9, 10)
          .filter(i -> i % 3 > 0)
          .map(i -> "#" + i * 10)
          .filter(s -> s.length() < 4)
          .subscribe(s -> System.out.println("D: " + s));