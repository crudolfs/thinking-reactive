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

---
## Event-driven
- reacting to change
![Event-driven](assets/img/event_driven_snake.png)

---
## Data Streams
- a sequence of data events over time
![Data Streams](assets/img/data_stream.png)

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

---
### Stream processing
![Stream processing](assets/img/reactive_stream_processing.png)

---
### Stream processing
![Stream processing](assets/img/reactive_programming_context.png)

---
## Useful scenarios Front-End
- Processing mouse movement and clicks
- keyboard typing
- GPS signals over time
- touch events

---
## Useful scenarios Back-End
- Processing any latency-bound IO events from disk or network (IO is inherently asynchronous)
- Handling system events from a server
- Events triggered from sensors
- Streaming data to front-ends (WebSockets or Server Sent Events)

