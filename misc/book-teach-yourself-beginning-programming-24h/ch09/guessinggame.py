# A program that generates a random
# number between 1 and 100 and then
# counts the number of guesses
# for the user to get it right


# The function to generate the random
# number is in the random module
import random

correctNum = random.randint(1, 100)


# Initialize the number of guesses to 0
# Also set the guess being right tracker
# to N for the while loop

numGuesses = 0
guessRight = 'N'


print("It's time for the Python Guessing Game!")
print("How quick can you guess this number?")
print("It's between 1 and 100...")

# The loop will keep running until the guess is correct
while guessRight == 'N':

	# Get a guess and increment the number of guesses
	newGuess = int(input("What do you think the number is? "))
	numGuesses += 1

	# A series of if and elif statements comparing the guess
	# to the answer and will give a higher or lower hint

	if newGuess > correctNum:
		print(newGuess, "is too large!")
		print("Try again!")
	elif newGuess < correctNum:
		print(newGuess, "is too small!")
		print("Try again!")
	else:
		print(newGuess, "is the right number!")
		print("Great job!")
		guessRight = 'Y'
print("It took only", numGuesses, "guesses to get it right!")
