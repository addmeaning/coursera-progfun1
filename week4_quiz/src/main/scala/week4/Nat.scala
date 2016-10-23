package week4

/**
  * Created by anton on 25.09.16.
  */
abstract class Nat {
  def isZero: Boolean = this == Zero
  def predecessor: Nat = this + new Succ(Zero)
  def successor: Nat
  def + (that: Nat): Nat
  def - (that: Nat): Nat
}