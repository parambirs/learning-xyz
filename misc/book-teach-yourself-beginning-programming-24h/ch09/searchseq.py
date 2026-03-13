# Sequential search for an item's description and price.

# This program assumes that the variable named totalNumber
# contains the total number of items in the inventory,
# and therefore, in the lists as well.

totalNumber = 5
partNo = [34, 87, 12, 99, 40]
desc = ["mouse", "printer", "monitor", "keyboard", "graphics card"]
price = [19.99, 49.50, 99.99, 35.00, 103.75]

# First, get the part number the user wants to look up
searchPt = int(input("What is the number of the part you want to see? "))

foundPart = 0 	# a flag to know if the part is found

# Look through all inventory items
for i in range(totalNumber):
	if (partNo[i] == searchPt):
		print("Part number:", searchPt)
		print("Description:", desc[i])
		print("Price: $%.2f" % price[i])
		# Turn on the flag
		foundPart = 1
		break

# Now check the found part flag to see whether we found the part
if foundPart == 0:
	print("** Sorry, but that part number is not in the inventory.")
