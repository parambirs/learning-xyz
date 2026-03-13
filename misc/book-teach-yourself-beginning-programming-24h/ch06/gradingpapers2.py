# Program uses a while loop to 
# get students names and grades
# until the teacher is done

# Set up two lists
# one for names and one for grades
studentnames = []
studentscores = []

answer = 'Y'
students = 0
totalscore = 0

# Get the names and test scores for each student
while answer == 'Y':
	studentnames.append(input("Name: "))
	studentscores.append(int(input("What was their test score? ")))
	totalscore += studentscores[students]
	students += 1
	answer = input("Do you have another score to enter (Y/N)? ")

# Print all the names and grades
for x in range(students):
	print(studentnames[x], "scored", studentscores[x])

print("The average score was %.1f." % (totalscore / students))
