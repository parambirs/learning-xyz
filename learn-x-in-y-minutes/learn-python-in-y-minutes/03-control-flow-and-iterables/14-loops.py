"""
For loops iterate over lists
prints:
	dog is a mammal
	cat is a mammal
	mouse is a mammal
"""
for animal in ["dog", "cat", "mouse"]:
	# You can use format() to interpolate formatted strings
	print("{} is a mammal".format(animal))

"""
"range(number)" returns an iterable of numbers
from zero up to (but excluding) the given number
prints:
	0
	1
	2
	3
"""
for i in range(4):
	print(i)

"""
"range(lower, upper)" returns an iterable of numbers
from the lower number to the upper number
prints:
	4
	5
	6
	7
"""
for i in range(4, 8):
	print(i)

"""
"range(lower, upper, step)" returns an iterable of numbers
from the lower number to the upper number, while incrementing
by step. If step is not indicated, the default value is 1.
prints:
	4
	6
"""
for i in range(4, 8, 2):
	print(i)

"""
Loop over a list to retrieve both the index and the value of each list item:
	0 dog
	1 cat
	2 mouse
"""
animals = ["dog", "cat", "mouse"]
for i, value in enumerate(animals):
	print(i, value)

"""
while loops go until a condition is no longer met.
prints:
	0
	1
	2
	3
"""
x = 0
while x < 4:
	print(x)
	x += 1	# Shorthand for x = x + 1
