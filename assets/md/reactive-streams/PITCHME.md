---
## Reactive Programming In Java

---
## Reactive Streams Implementations
- RxJava, Project Reactor, Akka
![Reactive Streams implementations](assets/img/reactive_logos.png)

---
## Technology Stacks
![Spring Boot 2.0](assets/img/spring_boot_2.0_reactor.png)

---
## Technology Stacks
![Vert.x logo](assets/img/vertx_logo.png)
![Vert.x scale](assets/img/vertx_reactive.png)

---
@snap[north span-100]
## Async vs Sync
@snapend

@snap[midpoint span-80]
@box[bg-purple text-white demo-box-text-padding rounded](RxJava and Reactor are purposefully **agnostic** with respect to where the *asynchrony* originates.)
@snapend

---
## Asynchronous
- the processing of an event is happening at some arbitrary time, possibly in the future
![Asynchrony](assets/img/asyncrony.png)

---
## Concurrency can originate from
- threadpools
- event loops
- actors
- etc.

---
## Non-blocking IO
![Non-Blocking](assets/img/nonblocking_io.png)

---
## Async vs Sync
- Producer is by default synchronous, emitting the data on the subscriber's thread

---?code=assets/src/RxJavaSample04.java&lang=java&title=RxJava2 Example
@[3-7](Uses subscriber's thread)

---
## When to use synchronous
- In-memory data
- Synchronous computation (stream composition)

---
## Synchronous computation
- Most operators (map(), filter(), flatMap(), groupBy()) are synchronous

---?code=assets/src/RxJavaSample05.java&lang=java&title=RxJava2 Example
@[3-9](Uses subscriber's thread)
@[11-13](map operator is synchronous for performance reasons)

---
## Concurrency and Parallelism
- Concurrency is the composition or interleaving of multiple tasks
- Parallelism is the simultaneous execution of tasks

---
## Producer contract
- a single (Observable) stream must always be serialized and thread-safe
- reasons:
  - Observer doesn't need to code defensively for concurrent invocation
  - Non-associative and non-commutative streams
  - performance (synchronization overhead)

---?code=assets/src/RxJavaSample06.java&lang=java&title=RxJava2 Example
### DON'T DO THIS

---
## Apply concurrency
- Stream composition
- Each (Observable) stream operates independently (and thus concurrently)

---?code=assets/src/RxJavaSample07.java&lang=java&title=RxJava2 Example

---
## Lazy vs Eager
- Future and CompletableFuture are eager
- Flowable, Flux, Observable, etc. are lazy

---
## Laziness means
- Subscription, not construction starts work
- Producers (Observables) can be reused

---?code=assets/src/RxJavaSample08.java&lang=java&title=RxJava2 Example

