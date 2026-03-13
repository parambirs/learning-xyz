# Program asks how many students are in a class
# and then gets their names and grades

# Get the number of students in the class
students = int(input("How many students? "))

# Set up two lists
# one for names and one for grades
studentnames = []
studentscores = []

# Get the test scores for each student
for x in range(students):
	studentnames.append(input("Name: "))
	studentscores.append(int(input("What was their test score? ")))

# Print all the names and grades
for x in range(students):
	print(studentnames[x], "scored", studentscores[x])
