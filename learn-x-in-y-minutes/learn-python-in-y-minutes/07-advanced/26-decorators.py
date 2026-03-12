# Decorators are a form of syntactic sugar.

# Wrappers are one type of decorator.
# They're really useful for adding logging to existing functions without
# needing to modify them.

def log_function(func):
	def wrapper(*args, **kwargs):
		print("Entering function", func.__name__)
		result = func(*args, **kwargs)
		print("Exiting function", func.__name__)
		return result
	return wrapper

@log_function							# equivalent
def my_function(x, y):					# def my_function(x, y):
	"""Adds two numbers together."""
	return x + y 						# return x + y

										# my_function = log_function(my_function)
# The decorator @log_function tells us as we begin reading the function definition
# for my_function that this function will be wrapped with log_function.
# When function definitions are long, it can be hard to parse the non-decorated
# assignment at the end of the definition.

my_function(1, 2)
# => Entering function my_function
# => "3"
# => Exiting function my_function

# But there's a problem
# What happens if we try to get some information about my_function?

print(my_function.__name__)		# => 'wrapper'
print(my_function.__doc__)		# => None (wrapper function has no docstring)

# Because our decorator is equivalent to my_function = log_function(my_function)
# we've replaced information about my_function with information from wrapper

# Fix this using functools

from functools import wraps

def log_function(func):
	@wraps(func)	# this ensures docstring, function name, arguments list, etc. are
					# all copied to the wrapped function - instead of being replaced
					# with wrapper's info
	def wrapper(*args, **kwargs):
		print("Entering function", func.__name__)
		result = func(*args, **kwargs)
		print("Exiting function", func.__name__)
		return result
	return wrapper

@log_function							
def my_function(x, y):				
	"""Adds two numbers together."""
	return x + y 	

my_function(1, 2)	# => Entering function my_function
					# => 3
					# => Exiting function my_function

print(my_function.__name__)		# => 'my_function'
print(my_function.__doc__)		# => 'Adds two numbers together.'
