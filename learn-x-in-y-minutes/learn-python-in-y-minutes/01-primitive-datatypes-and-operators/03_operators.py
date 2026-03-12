# Equality is ==
1 == 1  # => True
2 == 1  # => False

# Inequality is !=
1 != 1  # => False
2 != 1  # => True

# More comparisons
1 < 10  # => True
1 > 10  # => False
2 <= 2  # => True
2 >= 2  # => True

# Seeing whether a value is in a range
1 < 2 and 2 < 3  # => True
2 < 3 and 3 < 2  # => False
# Chaining makes this look nicer
1 < 2 < 3  # => True
2 < 3 < 2  # => False

# `is` vs. `==`
# is checks if two variables refer to the same object, but 
# == checks if the objects pointed to have the same values.
a = [1, 2, 3, 4]	# Point a at a new list, [1, 2, 3, 4]
b = a 				# Point b at what a is pointing to
b is a				# => True, a and b refer to the same object
b == a 				# => True, a's and b's objects are equal
b = [1, 2, 3, 4]	# Point b at a new list, [1, 2, 3, 4]
b is a 				# => False, a and b do not refer to the same object
b == a 				# => True, a's and b's objects are equal

