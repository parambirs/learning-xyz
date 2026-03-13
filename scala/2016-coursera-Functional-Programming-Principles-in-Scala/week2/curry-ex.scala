def product(f: Int => Int)(a: Int, b: Int): Int =
    if (a > b) 1 else f(a) * product(f)(a + 1, b)

println(product(x => x * x)(3, 4))

def factorial(n: Int): Int = product(x => x)(1, n)
println(factorial(5))

def mapReduce(unit: Int, combiner: (Int, Int) => Int)(f: Int => Int)(a: Int, b: Int): Int =
  if (a > b) unit else combiner(f(a), mapReduce(unit, combiner)(f)(a + 1, b))

def product2 = mapReduce(1, (a, b) => a * b) _
println(product2(x => x * x)(3, 4))
