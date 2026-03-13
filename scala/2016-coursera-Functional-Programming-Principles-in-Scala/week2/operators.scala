class Rational(x: Int, y: Int) {
  require( y != 0, "denominator must be nonzero")

  def this(x: Int) = this(x, 1)

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  private val g = gcd(x, y)
  def numer = x / g
  def denom = y / g

  def + (that: Rational): Rational =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )

  def unary_- : Rational = new Rational(-numer, denom)

  def - (that: Rational): Rational = this + -that

  def < (that: Rational) = numer * that.denom < that.numer * denom

  def max(that: Rational) = if (this < that) that else this

  override def toString = numer + "/" + denom
}

val x = new Rational(1, 3)
println(x.numer)
println(x.denom)

val y = new Rational(5, 7)
println(x + y)

val z = new Rational(3, 2)
println(x - y - z)
println(y + y)
println(x < y)
println(x max y)

println(new Rational(2))


(((a + b) ^? (c ?^ d)) less ((a ==> b) | c))
