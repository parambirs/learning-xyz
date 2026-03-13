# Program that calls the functions
# in the Function3 file

from Functions3 import thirds

checker = float(input("Enter a number: "))

test1 = thirds(checker)
print("One third is %.2f" % test1)
