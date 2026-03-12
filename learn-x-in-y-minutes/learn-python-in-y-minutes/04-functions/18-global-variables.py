# global scope
x = 5

def set_x(num):
	# local scope begins here
	# local val x not the same as global var x
	x = num		# => 43
	print(x)	# => 43

def set_global_x(num):
	# global indicates that particular var lives in the global scope
	global x
	print(x)	# => 5
	x = num		# global var x is now set to 6
	print(x)	# => 6

set_x(43)
set_global_x(6)
"""
prints:
    43
    5
    6
"""

