# Program that decides how much of a bonus 
# to pay a salesperson

# Get the name and sales of the salesperson
salesname = input("What is the salesperson's name? ")
salestotal = int(input("What were their sales? "))
if salestotal < 5000:
	bonus = 0
	daysOff = 0
else:
	bonus = 1000
	daysOff = 2

print(salesname, "earned a bonus of", bonus)
print("as well as", daysOff, "days off!")
