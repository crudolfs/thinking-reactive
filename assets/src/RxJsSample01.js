import Rx from 'rxjs'

Rx.Observable
  .from([1,2,3])
  .map(x => x * 3)
  .subscribe(x => console.log(x))