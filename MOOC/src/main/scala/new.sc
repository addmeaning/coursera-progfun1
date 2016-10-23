object scratch{

  def error(msg: String) = throw new Error(msg)
  val x = null
  val y: String = x
  if (true) 1 else false
  def countChange(money: Int, coins: List[Int]): Int = {
    if(money == 0)
      1
    else if(money > 0 && !coins.isEmpty)
      countChange(money - coins.head, coins) + countChange(money, coins.tail)
    else
      0
  }
  var list = List(80, 10, 3)
  countChange(90, list)
  def moneyChanges(money: Int, coins: List[Int]) : Option[List[Seq[Int]]]= {
    var listOfChange = List[Seq[Int]]()
    def changeMoney(capacity: Int, changes: List[Int], listOfCoins: Option[Seq[Int]]): Int = {
      if (capacity == 0) {
        listOfChange = listOfCoins.get :: listOfChange
        1
      } else if (capacity < 0)
        0
      else if (changes.isEmpty && capacity >= 1)
        0
      else {
        changeMoney(capacity, changes.tail, listOfCoins) +
          changeMoney(capacity - changes.head, changes,
            Some(changes.head +: listOfCoins.getOrElse(Seq())))
      }
    }

    changeMoney(money, coins.sortWith(_.compareTo(_) < 0), None)
    Some(listOfChange)
  }
  private val ints: List[Seq[Int]] = moneyChanges(90, list).get
  println(ints)
}