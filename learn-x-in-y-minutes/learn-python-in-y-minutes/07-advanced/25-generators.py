####################################################
## 7. Advanced
####################################################

# Generators help you make lazy code.
def double_numbers(iterable):
	for i in iterable:
		yield i + 1

# Generators are memory-efficient because they only load the data needed to
# process the next value in the iterable. This allows them to perform
# operations on otherwise prohibitively large value ranges.
for i in double_numbers(range(1, 9000000000)):	# `range` is a generator.
	print(i)
	if i >= 30:
		break

# Just as you can create a list comprehension, you can also create a
# generator comprehension.
values = (-x for x in [1, 2, 3, 4, 5])
for x in values:
	print(x)	# prints -1 -2 -3 -4 -5 to console/terminal

# You can also cast a generator comprehension directly to a list.
values = (-x for x in [1, 2, 3, 4, 5])
gen_to_list = list(values)
print(gen_to_list)		# => [-1, -2, -3, -4, -5]