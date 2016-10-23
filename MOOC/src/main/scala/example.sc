def pascal(column: Int, row: Int): Int =
  if (column == 0) 1 else if (row == 0) 0 else pascal(column, row - 1) + pascal(column - 1, row - 1)


def count(chars: List[Char], counter: Int): Int =
  if (chars.isEmpty) counter
  else if (chars.head.equals('(')) count(chars.tail, counter + 1)
  else if (chars.head.equals(')') && counter > 0) count(chars.tail, counter - 1)
  else if (chars.head.equals(')') && counter <= 0) count("".toList, -1)
  else count(chars.tail, counter)
def balance(chars: List[Char]): Boolean =
  count(chars, 0) == 0

balance("(())".toList)

def countChange(money: Int, coins: List[Int]): Int =
if (money == 0) 1 else if (coins.nonEmpty && money>0)
  countChange(money-coins.head, coins)+countChange(money, coins.tail) else 0

countChange(4, List(1,2))

type Set = Int => Boolean

def contains(s: Set, elem: Int): Boolean = s(elem)

def singletonSet(s: Integer): Set = Set(s)

val a = singletonSet(5)

def union(s: Set, t: Set): Set = Set(s, t)
val q = union(union(singletonSet(5), singletonSet(8)), singletonSet(222))
contains(q, 5)
//def intersect(s: Set, t: Set): Set = contains(s, )