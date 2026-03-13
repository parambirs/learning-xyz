class Rational(x: Int, y: Int) {
  require( y != 0, "denominator must be nonzero")

  def this(x: Int) = this(x, 1)

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  private val g = gcd(x, y)

  def numer = x / g
  def denom = y / g

  def add(that: Rational): Rational =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )

  def neg: Rational = new Rational(-numer, denom)

  def sub(that: Rational): Rational = add(that.neg)

  def less(that: Rational) = numer * that.denom < that.numer * denom

  def max(that: Rational) = if (this.less(that)) that else this

  override def toString = numer + "/" + denom
}

val x = new Rational(1, 3)
println(x.numer)
println(x.denom)

val y = new Rational(5, 7)
println(x.add(y))

val z = new Rational(3, 2)
println(x.sub(y).sub(z))
println(y.add(y))
println(x.less(y))
println(x.max(y))

// val strange = new Rational(1, 0)
// println(strange.add(strange))

println(new Rational(2))
