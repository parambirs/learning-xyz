trait List[T] {
  def isEmpty: Boolean
  def head: T
  def tail: List[T]
}

class Cons[T](val head: T, val tail: List[T]) extends List[T] {
  def isEmpty = false
}

class Nil[T] extends List[T] {
  def isEmpty = true
  def head: Nothing = throw new NoSuchElementException("Nil.head")
  def tail: Nothing = throw new NoSuchElementException("Nil.head")
}

object Main {
  def singleton[T](elem: T) = new Cons[T](elem, new Nil[T])

  def nth[T](n: Int, list: List[T]): T =
    if (list.isEmpty) throw new IndexOutOfBoundsException
    if (n == 0) list.head
    else nth(n - 1, list.tail)

  def main(args: Array[String]): Unit = {
    val list = new Cons(1, new Cons(2, new Cons(3, new Nil)))
    println(nth(2, list))
    println(nth(-1, list))
  }

}
