# Uses the program functions to
# get a set of values and then sort them

import usefulFunctions

numSize = int(input("How many values do you want to enter? "))
numberSet = []

usefulFunctions.askForData(numberSet, numSize)

print("Before sorting...")
usefulFunctions.printData(numberSet, numSize)

usefulFunctions.sortData(numberSet, numSize)

print("After sorting...")
usefulFunctions.printData(numberSet, numSize)
