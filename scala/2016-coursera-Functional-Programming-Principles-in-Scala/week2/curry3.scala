def sum(f: Int => Int)(a: Int, b: Int): Int =
    if (a > b) 0 else f(a) + sum(f)(a + 1, b)
    
def sumInts = sum(x => x)
def sumCubes = sum(x => x * x * x)
def sumFactorials = sum(fact)

def fact(x: Int): Int = if (x == 0) 1 else x * fact(x - 1)


println(sumCubes(3, 5))
