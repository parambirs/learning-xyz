val nums = Vector(1, 2, 3, -88)
val people = Vector("Bob", "James", "Peter")

val xs = Array(1, 2, 3, 4)
xs map (x => x * 2)

val s = "Hello World"
s filter (c => c.isUpper)

s exists (c => c.isUpper)
s forall (c => c.isUpper)

val pairs = List(1,2,3) zip s
pairs.unzip

s flatMap (c => List('.', c))

def scalarProduce(xs: Vector[Double], ys: Vector[Double]): Double =
  (xs zip ys).map(xy => xy._1 * xy._2).sum

def scalarProduct2(xs: Vector[Double], ys: Vector[Double]): Double =
  (xs zip ys).map{ case (x, y) => x * y }.sum

def isPrime(n: Int): Boolean = (2 until n) forall (d => n % d == 0)
