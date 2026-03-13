val fruit: List[String] = List("apples", "oranges", "pears")
val nums: List[Int] = List(1, 2, 3, 4)
val diag3: List[List[Int]] = List(List(1, 0, 0), List(0, 1, 0), List(0, 0, 1))
val empty: List[Nothing] = List()

val fruit2 = "apples" :: ("oranges" :: ("pears" :: Nil))
val nums2 = 1 :: (2 :: (3 :: (4 :: Nil)))
val empty2 = Nil

val nums3 = 1 :: 2 :: 3 :: 4 :: Nil

def insert(x: Int, xs: List[Int]): List[Int] = xs match {
  case List() => List(x)
  case y :: ys =>
    if (x < y)
      x :: y :: ys
    else
      y :: insert(x, ys)
}

def isort(xs: List[Int]): List[Int] = xs match {
  case List() => List()
  case y :: ys => insert(y, isort(ys))
}
