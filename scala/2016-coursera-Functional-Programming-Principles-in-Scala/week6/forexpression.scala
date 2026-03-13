case class Person(name: String, age: Int)

for (p <- persons if p.age > 20) yield p.name

for {
  i <- 1 until n
  j <- 1 until i
  if isPrime(i + j)
} yield (i, j)

def scalarProduct(xs: List[Double], ys: List[Double]): Double =
  (for {
    (x, y) <- xs zip ys
  } yield (x*y)).sum
