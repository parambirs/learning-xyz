# There are also anonymous functions
(lambda x: x > 2)(3)					# => True
(lambda x, y: x ** 2 + y ** 2)(2, 1)	# => 5

def add_10(x):
	return x + 10

# There are built-in higher-order functions
print(list(map(add_10, [1, 2, 3])))			# => [11, 12, 13]
print(list(map(max, [1, 2, 3], [4, 2, 1])))	# => [4, 2, 3]

print(list(filter(lambda x: x > 5, [3, 4, 5, 6, 7])))	# => [6, 7]

# We can use list comprehensions for nice maps and filters
# List comprehension stores the output as a list (which itself may be nested).
print([add_10(i) for i in [1, 2, 3]])			# => [11, 12, 13]
print([x for x in [3, 4, 5, 6, 7] if x > 5])	# => [6, 7]

# You can construct set and dict comprehensions as well.
print({x for x in "abcddeef" if x not in "abc"})	# => {'d', 'e', 'f'}
print({x: x**2 for x in range(5)})					# => {0: 0, 1: 1, 2: 4, 3: 9, 4: 16}