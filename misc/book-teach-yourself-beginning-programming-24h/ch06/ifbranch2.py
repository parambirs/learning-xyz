# Program that decides how much of a bonus 
# to pay a salesperson

# Get the name and sales of the salesperson
salesname = input("What is the salesperson's name? ")
sales = int(input("What were their sales? "))
if sales > 10000:
	bonus = 400
	daysOff = 4
elif sales > 7500:
	bonus = 250
	daysOff = 3
elif sales > 5000:
	bonus = 100
	daysOff = 2
else:
	bonus = 0
	daysOff = 0

print(salesname, "earned a bonus of", bonus)
print("as well as", daysOff, "days off!")
