# A program that initially creates a dictionary of months with 
# 0 sales totals per month and then obtains the sales from the 
# user, finally printing out values, a total and an average

# Dictionary created with the first six months and no sales
salesMonths = {"Jan": 0, "Feb": 0, "Mar": 0, "Apr": 0, "May": 0, "Jun": 0}

# We forgot the second half of the year, so add them to the dictionary
salesMonths["Jul"] = 0
salesMonths["Aug"] = 0
salesMonths["Sep"] = 0
salesMonths["Oct"] = 0
salesMonths["Nov"] = 0
salesMonths["Dec"] = 0

# Loop through all the months to get actual sales
for x in salesMonths:
	question = "What were the sales in " + x + "? "
	salesMonths[x] = float(input(question))

# Print out the sales by month
print("\n\n")
for y in salesMonths:
	print(y, salesMonths[y])

# Calculate both total sales and average sales by month
totYear = 0
entries = 0

for y in salesMonths:
	totYear += salesMonths[y]
	entries += 1

print("Total year's sales were", totYear)
print("An average month's sales were", (totYear/entries))
