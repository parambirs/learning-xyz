# Filename mergetown.py
# Program that asks the user's hometown and state
# and then displays it in a town, state format

# Ask the user for their hometown
town = input("What town are you from? ")

# Ask the user for their state
state = input("In what state were you born? ")

# Make a comma-separated variable for
# city, state format
fullLocation = town + ', ' + state

print("So you are from", fullLocation)
