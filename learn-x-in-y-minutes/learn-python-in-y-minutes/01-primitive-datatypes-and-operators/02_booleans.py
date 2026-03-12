# Boolean values are primitives (Note: the capitalization)
True   # => True
False  # => False

# negate with not
not True   # => False
not False  # => True

# Boolean Operators
# Note "and" and "or" are case-sensitive
True and False  # => False
False or True   # => True

# True and False are actually 1 and 0 but with different keywords
True + True  # => 2
True * 8     # => 8
False - 5    # => -5

# Comparison operators look at numerical value of True and False
0 == False   # => True
2 > True     # => True
2 == True    # => False
-5 != False  # => True

# None, 0, and empty strings/lists/dicts/tuples/sets all evaluate to False.
# All other values are True
bool(0)      # => False
bool("")     # => False
bool([])     # => False
bool({})     # => False
bool(())     # => False
bool(set())  # => False

bool(4)      # => True
bool(-6)     # => True

# Using boolean logical operators on ints casts them to booleans for evaluation,
# but their non-cast value is returned. Don't mix up with bool(ints) and bitwise
# and/or (&,|)
bool(0)   # => False
bool(2)   # => True
0 and 2   # => 0
bool(-5)  # => True
-5 or 0   # => -5

