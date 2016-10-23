package week4

/**
  * Created by anton on 25.09.16.
  */
class Succ(n: Nat) extends Nat{
  override def isZero: Boolean = false

  override def successor: Nat = new Succ(this)

  override def +(that: Nat): Nat = new Succ(n+that)

  override def -(that: Nat): Nat = if (that.isZero == true) this else this.successor - (that.predecessor)

  override def predecessor: Nat = n
}
