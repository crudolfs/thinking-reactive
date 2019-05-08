---
@snap[north span-100 text-white text-1]
@quote[Reactive programming is a general programming term that is focused on reacting to changes, such as data values or events.](Reactive Programming in RxJava)
<br>
@snapend

@snap[midpoint span-100 text-white fragment]
<br>
@quote[Reactive programming is an asynchronous programming paradigm concerned with data streams and the propagation of change.](Wikipedia)
@snapend

@snap[south span-100 text-white fragment]
@quote[Reactive Programming = Functional Programming++](Venkat Subramaniam)
@snapend

---?color=#FFFFFF
### @color[black](Data Streams)
@color[black](a sequence/stream of data events over time)
![Data Streams](assets/img/data_stream.png)

---?image=assets/img/event_driven_snake.png&size=auto 50%&color=#FFFFFF
@snap[north span-100]
### @color[black](Event-Driven)
@snapend

@snap[west span-20]
@color[black](reacting to change)
@snapend

---?color=#FFFFFF
#### @color[black](Timeline)
![Timeline](assets/img/timeline.png)

---?color=#FFFFFF
#### @color[black](Stream completes successfully)
![Timeline events succeed](assets/img/timeline_events_success.png)

---?color=#FFFFFF
#### @color[black](Stream completes with an error)
![Timeline events error](assets/img/timeline_events_error.png)

---?color=#FFFFFF
#### @color[black](Stream doesn't terminate)
![Timeline events infinite](assets/img/timeline_events_infinite.png)

---?color=#FFFFFF
#### @color[black](Stream processing)
![Stream processing](assets/img/reactive_stream_processing_03.png)

---?color=#FFFFFF
#### @color[black](Observer Design Pattern)
![Observer Pattern](assets/img/observer_pattern_01.png)

---?color=#FFFFFF
#### @color[black](Observer Design Pattern)
![Observer Pattern](assets/img/observer_pattern_02.jpg)

---?color=#FFFFFF
#### @color[black](Publisher / Subscriber interaction)
![Stream processing](assets/img/reactive-pubsub-flow.png)

---?image=assets/img/reactive_sequence_diagram.png&size=auto 75%&color=#CCDAE7
@snap[north span-100]
#### @color[black](Data flow process)
@snapend

---
## Useful scenarios Front-End
- Processing mouse movement and clicks
- Keyboard typing
- Touch events
- GPS signals over time
- Consume data streams from back-end

---
## Useful scenarios Back-End
- Processing any latency-bound IO events from disk or network (IO is inherently asynchronous)
- Handling system events from a server
- Events triggered from sensors
- Pushing data to front-ends (via WebSockets or Server Sent Events)
