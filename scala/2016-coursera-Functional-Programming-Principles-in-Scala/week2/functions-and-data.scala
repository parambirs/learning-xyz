class Rational(x: Int, y: Int) {
  def numer = x
  def denom = y
}

val x = new Rational(1, 2)
println(x.numer)
println(x.denom)

def addRational(r: Rational, s: Rational): Rational =
  new Rational(
    r.numer * s.denom + s.numer * r.denom,
    r.denom * s.denom
  )

def makeString(r: Rational) =
  r.numer + "/" + r.denom

println(makeString(addRational(new Rational(1, 2), new Rational(2, 3))))
