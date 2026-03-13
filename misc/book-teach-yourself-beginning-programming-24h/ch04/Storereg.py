# Filename: Storereg.py
# A more practical use of input and output
# Asks users for specific info on sold items

print("Welcome to Fran's Place!\n\n")
print("Let's proceed to checkout!")

# A series of statements to find out how much of each
# item has been purchased

candy = int(input("How many candy bars did they buy? "))
drinks = int(input("How many energy drinks did they buy? "))
gas = int(input("How many gallons of gas did they buy? "))

# This section will take each value and
# multiply it by the current cost per item
candytotal = candy * 1.25
drinktotal = drinks * 2.25
gastotal = gas * 2.879
subtotal = candytotal + drinktotal + gastotal

# Don't forget sales tax! 7.25% in this example
tax = subtotal * .0725

# Finally print the itemized receipt

print("\n\nItem	Qnt	  Total")
print("-------------------------------")
print("Candy  ", candy, "        $%.2f" % candytotal)
print("Drinks ", drinks, "        $%.2f" % drinktotal)
print("Gas    ", gas, "        $%.2f" % gastotal)
print("-------------------------------")
print("Subtotal          $%.2f" % subtotal)
print("Tax               $%.2f" % tax)
print("Total             $%.2f" % (subtotal + tax))
print("\n\nHAVE A GREAT DAY!")
