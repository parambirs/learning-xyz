# Binary search for an item's description and price.
# (This assumes the arrays have been filled
# and SORTED in partNum order elsewhere.)

# This code would be part of a larger inventory program.
# ** This program assumes that the variable named totalNumber
# contains the total number of items in the inventory,
# and therefore, in the arrays as well.

totalNumber = 5
partNo = [12, 34, 40, 87, 99]
desc = ["monitor", "mouse", "keyboard", "printer", "graphics card"]
price = [99.99, 19.99, 35.00, 49.50, 103.75]

# First, get the part number the user wants to look up
searchPt = int(input('What is the number of the part you want to see? '))

first = 0 	# set the lower bound of your search
last = totalNumber - 1 	# the upperbound of the search
found = 0 	# the flag that the part was found

while first <= last:
	mid = int((first + last) / 2)
	if (searchPt == partNo[mid]):
		print("Part number", searchPt, "'s description is ")
		print(desc[mid])
		print("With a price of $%.2f" % price[mid])
		found = 1
		break	# exit the while loop
	elif searchPt < partNo[mid]:	# check the lower half of the array
		last = mid - 1
	else:
		first = mid + 1 	# check the upper half of the array

if found == 0:	# the part was not in the array
	print("** Sorry, but that part number is not in the inventory.")
