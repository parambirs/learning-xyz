def thirds(target):
	"This function will take a number and return 1/3 of it"
	third = target / 3
	return third

candy = int(input("How many pieces of candy in the bag? "))
candyperkid = thirds(candy)
print("Each kid gets", candyperkid, "pieces")
