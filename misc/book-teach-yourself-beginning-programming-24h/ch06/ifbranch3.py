# Program that demonstrates multiple
# if, elif and else statements

# Get the day of the month someone was born
bdate = int(input("What day were you born? "))

if bdate <= 7:
	print("The first week of the month")
elif bdate <= 18:
	print("The middle of the month")
elif bdate <= 31:
	print("The end of the month")
else:
	print("I don't think that's right")
