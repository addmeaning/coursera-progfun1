package recfun

object Main {
  def main(args: Array[String]) {
//    println("Pascal's Triangle")
//    for (row <- 0 to 10) {
//      for (col <- 0 to row)
//        print(pascal(col, row) + " ")
//      println()
//    }
  }

  /**
    * Exercise 1
    */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0) 1 else if (r == 0) 0 else pascal(c, r - 1) + pascal(c - 1, r - 1)
  }


  /**
    * Exercise 2
    */
  def count(chars: List[Char], counter: Int): Int =
    if (chars.isEmpty) counter
    else if (chars.head.equals('(')) count(chars.tail, counter + 1)
    else if (chars.head.equals(')') && counter > 0) count(chars.tail, counter - 1)
    else if (chars.head.equals(')') && counter <= 0) count("".toList, -1)
    else count(chars.tail, counter)


  def balance(chars: List[Char]): Boolean =  count(chars, 0) == 0

  /**
    * Exercise 3
    */
  def countChange(money: Int, coins: List[Int]): Int =
  if (money == 0) 1 else if (coins.nonEmpty && money>0)
    countChange(money-coins.head, coins)+countChange(money, coins.tail) else 0
}
