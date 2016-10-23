package week4

import java.util.NoSuchElementException

/**
  * Created by anton on 24.09.16.
  */
trait List[T] {
  def isEmpty: Boolean
  def head: T
  def tail: List[T]

}

class Cons[T](val head: T, val tail: List[T]) extends List[T]{
  override def isEmpty: Boolean = false
}
class Nil[T] extends List[T]{
  override def isEmpty: Boolean = true

  override def tail: Nothing = throw new NoSuchElementException("Nil.tail")

  override def head: Nothing = throw new NoSuchElementException("Nil.head")
}

