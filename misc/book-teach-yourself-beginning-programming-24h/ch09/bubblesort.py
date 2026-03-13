# Uses the bubble sort algorithm to sort a
# set of values

values = [10, 54, 34, 21, 23]
temp = 0

# Outer loop
for x in range(len(values)):
	# Inner loop for comparisons
	for ctr in range(len(values)-1):
		if values[ctr] > values[ctr+1]:
			temp = values[ctr]
			values[ctr] = values[ctr+1]
			values[ctr+1] = temp

print("Here is the list after sorting...")
print(values)
