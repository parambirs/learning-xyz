def sum(xs: List[Int]) = (0 :: xs) reduceLeft ((x, y) => x + y)
def product(xs: List[Int]) = (1 :: xs) reduceLeft ((x, y) => x * y)

def sum2(xs: List[Int]) = (0 :: xs) reduceLeft (_ + _)
def product2(xs: List[Int]) = (1 :: xs) reduceLeft (_ * _)

def sum3(xs: List[Int]) = (xs foldLeft 0)(_ + _)
def product3(xs: List[Int]) = (xs foldLeft 1)(_ * _)

def mapFun[T, U](xs: List[T], f: T => U): List[U] =
  (xs foldRight List[U]())((x, acc) => f(x) :: acc)

def lengthFun[T](xs: List[T]): Int =
  (xs foldRight 0)((_, acc) => acc + 1)
