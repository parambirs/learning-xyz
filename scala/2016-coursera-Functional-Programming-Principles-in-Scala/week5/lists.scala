def last[T](xs: List[T]): T = xs match {
  case List() => throw new Error("last of empty list")
  case List(x) => x
  case y :: ys => last(ys)
}

def init[T](xs: List[T]): List[T] = xs match {
  case List() => throw new Error("init of empty list")
  case List(x) => List()
  case y :: ys => y :: init(ys)
}

def concat[T](xs: List[T], ys: List[T]): List[T] = xs match {
  case List() => ys
  case x :: xs1 => x :: concat(xs1, ys)
}

def reverse[T](xs: List[T]): List[T] = xs match {
  case List() => List()
  case y :: ys => reverse(ys) ++ List(y)
}

def removeAt[T](n: Int, xs: List[T]) =
  if (n >= xs.length) xs else xs.take(n) ++ xs.drop(n+1)

def msort2(xs: List[Int]): List[Int] = {
  val n = xs.length / 2
  if (n == 0) xs
  else {
    def merge(xs: List[Int], ys: List[Int]): List[Int] =
      (xs, ys) match {
        case (xs1, Nil) => xs1
        case (Nil, ys1) => ys1
        case (x :: xs1, y :: ys1) =>
          if (x < y) x :: merge(xs1, ys) else y :: merge(xs, ys1)
      }
    val (fst, snd) = xs splitAt n
    merge(msort2(fst), msort2(snd))
  }
}

def msort[T](xs: List[T])(lt: (T, T) => Boolean): List[T] = {
  val n = xs.length / 2
  if (n == 0) xs
  else {
    def merge(xs: List[T], ys: List[T]): List[T] =
      (xs, ys) match {
        case (xs1, Nil) => xs1
        case (Nil, ys1) => ys1
        case (x :: xs1, y :: ys1) =>
          if (lt(x, y)) x :: merge(xs1, ys) else y :: merge(xs, ys1)
      }
    val (fst, snd) = xs splitAt n
    merge(msort(fst)(lt), msort(snd)(lt))
  }
}

val nums = List(2, -4, 5, 7, 1)
val fruits = List("apple", "orange", "banana")

msort(nums)((x, y) => x < y)
msort(fruits)((x, y) => x.compareTo(y) < 0)
