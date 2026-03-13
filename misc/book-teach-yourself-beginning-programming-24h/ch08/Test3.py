# Program that calls the functions
# in the Function3 file

import Functions3

checker = float(input("Enter a number: "))

test1 = Functions3.thirds(checker)
print("One third is %.2f" % test1)

test2 = Functions3.fourths(checker)
print("One fourth is %.2f" % test2)

test3 = input("What would you like to say? ")
Functions3.sayHi(test3)
