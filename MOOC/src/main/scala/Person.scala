/**
  * Created by anton on 23.08.16.
  */
class Person(age: Integer) {

  val people: Array[Integer]
  val (minors, adults) = people partition (_<10)
}
