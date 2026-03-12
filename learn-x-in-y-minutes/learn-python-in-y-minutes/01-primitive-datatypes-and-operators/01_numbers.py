# Numbers
3  # => 3

# Math
1 + 1   # => 2
8 - 1   # => 7
10 * 2  # => 20
35 / 5  # => 7.0

# Floor division rounds towards negative infinity
5 // 3       # => 1
-5 // 3      # => -2
5.0 // 3.0   # => 1.0  # works on floats too
-5.0 // 3.0  # => -2.0

# The result of division is always a float
10.0 / 3  # => 3.3333333333333335

# Modulo operation
7 % 3   # => 1
# i % j has the same sign as j, unlike C
-7 % 3  # => 2
-7 // 3 # => -3
-7 % -3 # => -1
7 % -3  # => -2
7 // -3 # => -3

# Exponentiation (x**y, x to the yth power)
2**3  # => 8

# Enforce precedence with parentheses
1 + 3 * 2    # => 7
(1 + 3) * 2  # => 8