####################################################
## 4. Functions
####################################################

# Use "def" to create new functions
def add(x, y):
	print("x is {} and y is {}".format(x, y))
	return x + y 	# Return values with a return statement

# Calling functions with parameters
add(5, 6)	# => prints "x is 5 and y is 6" and returns 11

# Another way to call functions is with keyword arguments
add(y=6, x=5)	# Keyword arguments can arrive in any order.

# You can define functions that take a variable number of
# positional arguments
def varargs(*args):
	print(args)
	return args

varargs(1, 2, 3)	# => (1, 2, 3)

# You can define functions that take a variable number of
# keyword arguments as well
def keyword_args(**kwargs):
	print(kwargs)
	return kwargs

# Let's call it to see what happens
keyword_args(big="foot", loch="ness")	# => {'big': 'foot', 'loch': 'ness'}

# You can do both at once, if you like
def all_the_args(*args, **kwargs):
	print(args)
	print(kwargs)

all_the_args(1, 2, a=3, b=4)
# prints:
# (1, 2)
# {'a': 3, 'b': 4}

# When calling functions, you can do the opposite of args/kwargs!
# Use * to expand args (tuples) and use ** to expand kwargs (dictionaries).
args = (1, 2, 3, 4)
kwargs = {'aa': 3, 'bb': 4}
all_the_args(*args)				# equivalent: all_the_args(1, 2, 3, 4)
all_the_args(**kwargs)			# equivalent: all_the_args(aa=3, bb=4)
all_the_args(*args, **kwargs)	# equivalent: all_the_args(1, 2, 3, 4, aa=3, bb=4)

# Returning multiple values (with tuple assignments)
def swap(x, y):
	return y, x		# Return multiple values as a tuple without the parentheses.
					# Note: parentheses have been excluded, but can be included.

x = 1
y = 2
x, y = swap(x, y)	# => x=2, y=1
# (x, y) = swap(x, y)	# Again, the use of parentheses is optional

