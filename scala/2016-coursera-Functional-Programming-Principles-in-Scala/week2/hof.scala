// Take the sum of integers between a and b:
def sumInts(a: Int, b: Int): Int =
  if (a > b) 0 else a + sumInts(a + 1, b)

// Take the sum of the cubes of all the integers between a and b:
def cube(x: Int) = x * x * x

def sumCubes(a: Int, b: Int): Int =
  if (a > b) 0 else cube(a) + sumCubes(a + 1, b)

def fact(n: Int): Int =
  if (n <= 0) 1 else n * fact(n - 1)

def sumFactorials(a: Int, b: Int): Int =
  if (a > b) 0 else fact(a) + sumFactorials(a + 1, b)
