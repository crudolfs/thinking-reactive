---
## Reactive Programming APIs
- [ReactiveX](http://reactivex.io)
- [Reactive Streams](https://www.reactive-streams.org/)

---
@snap[north span-100]
## Reactive Streams API
@snapend

@snap[midpoint span-70]
@box[bg-purple text-white demo-box-text-padding rounded](Reactive Streams is an initiative to provide a *standard* for *asynchronous stream processing* with *non-blocking back pressure*.)
@snapend

---
## Reactive Streams Implementations
- RxJava, Project Reactor, Akka
![Reactive Streams implementations](assets/img/reactive_logos.png)

---
## Show me some code!

---?code=assets/src/RxJavaSample02.java&lang=java&title=RxJava2 Example
@snap[north span-100]
### RxJava2 Example
@snapend

@[3-5](Create publisher)
@[7-9](Apply operators)
@[10-12](Subscribe)

---?code=assets/src/RxJavaSample01.java&lang=java&title=RxJava2 Example
@snap[north span-100]
### RxJava2 Example
@snapend

@[3-5](Create publisher)
@[7-9](Apply operators)
@[10](Subscribe)

---?code=assets/src/ReactorSample02.java&lang=java&title=Reactor Example
@snap[north span-100]
### Project Reactor Example
@snapend

@[3-5](Create publisher)
@[7-9](Apply operators)
@[10-12](Subscribe)

---?code=assets/src/ReactorSample01.java&lang=java&title=Reactor Example
@snap[north span-100]
### Project Reactor Example
@snapend

@[3-5](Create publisher)
@[7-9](Apply operators)
@[10](Subscribe)

---?code=assets/src/RxJsSample01.js&lang=javascript&title=RxJs Example
@snap[north span-100]
### RxJS Example
@snapend

@[3-4](Create Observable)
@[5](Apply operators)
@[6](Subscribe)

---
### RX Operators
- [Marble diagrams](https://rxmarbles.com)
![Marble diagrams](assets/img/merge_marblediagram.png)

---?code=assets/src/RxJavaSample03.java&lang=java&title=Multiple streams
@snap[north span-100]
### Multiple streams
@snapend

@[3-5](Create stream of even integers)
@[7-9](Create stream of odd integers)
@[11-12](Merge both streams)
@[13-15](Subscribe)

---?code=assets/src/RxJavaSample03b.java&lang=java&title=Operators
@snap[north span-100]
### Output?
@snapend

@[1-5](Operators example)

