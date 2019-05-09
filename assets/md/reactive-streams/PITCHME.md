---
## Reactive Programming In Java

---
## Reactive Streams Implementations
- RxJava, Project Reactor, Akka
![Reactive Streams implementations](assets/img/reactive_logos.png)

---
## Software Stacks
![Spring Boot 2.0](assets/img/spring_boot_2.0_reactor.png)

---
## Software Stacks
![Vert.x logo](assets/img/vertx_logo.png)
![Vert.x scale](assets/img/vertx_reactive.png)

---
## Async vs Sync
- Producer is by default synchronous, emitting the data on the subscriber's thread

---?code=assets/src/RxJavaSample04.java&lang=java&title=RxJava2 Example
@[3-7](Uses subscriber's thread)

---
## Why synchronous
- In-memory data
- Synchronous computation (stream composition)

---
## Synchronous computation
- Most operators (map(), filter(), groupBy()) are synchronous

---?code=assets/src/RxJavaSample05.java&lang=java&title=RxJava2 Example
@[3-9](Uses subscriber's thread)
@[11-13](map operator is synchronous for performance reasons)

---
@snap[north span-100]
## Async vs Sync
@snapend

@snap[midpoint span-80]
@box[bg-purple text-white demo-box-text-padding rounded](RxJava and Reactor are purposefully **agnostic** with respect to where the *asynchrony* originates.)
@snapend

---
@snap[north span-100]
## Blocking vs Non-blocking
@snapend

@snap[midpoint span-80]
@box[bg-purple text-white demo-box-text-padding rounded](The actual criteria that is generally important is whether the Producer *event production* is ***blocking*** or ***non-blocking***.)
@snapend

---
## Non-blocking IO
![Non-Blocking](assets/img/nonblocking_io.png)

---
## Async vs Sync
- In production code the Producers (event production) usually originates from asynchronous sources like threadpools, event loops, actors etc.
- Therefore the use of subscribeOn and observeOn should not be seen commonly.

---
@snap[north span-100]
## Producer contract
@snapend

@snap[midpoint span-80]
@box[bg-purple text-white demo-box-text-padding rounded](A single (Observable) stream must always be serialized and thread-safe.)
@snapend

---?code=assets/src/RxJavaSample06.java&lang=java&title=RxJava2 Example
### DON'T DO THIS

---
## Producer contract reasons
- Observer doesn't need to code defensively for concurrent invocation
- Non-associative and non-commutative streams
- performance (synchronization overhead)

---
## Concurrency and Parallelism
- Concurrency is the composition or interleaving of multiple tasks
- Parallelism is the simultaneous execution of tasks

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
- Producers (Observables) can be reused (except Hot producers)

---?code=assets/src/RxJavaSample08.java&lang=java&title=RxJava2 Example

---
## Operators
- An operator is a function that takes upstream Observable<T> and returns downstream Observable<R>

---
### RX Operators
- [Marble diagrams](https://rxmarbles.com)
![Marble diagrams](assets/img/flatmap_marblediagram.png)

