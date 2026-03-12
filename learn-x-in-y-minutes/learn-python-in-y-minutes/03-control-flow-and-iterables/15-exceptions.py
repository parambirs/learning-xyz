# Handle exceptions with a try/except block
try:
	# Use "raise" to raise an error
	raise IndexError("This is an index error")
except IndexError as e:
	pass				# Refrain from this, provide a recovery.
except (TypeError, NameError):
	pass				# Multiple exceptions can be processed jointly.
else:					# Optional clause to the try/except block. Must follow all except blocks
	print("All good!")	# Runs only if the code in try raises no exceptions
finally:				# Execute under all circumstances
	print("We can clean up resources here")

# Instead of try/finally to cleanup resources, you can use a with statement
with open("myfile.txt") as f:
	for line in f:
		print(line)

# Writing to a file
contents = {"aa": 12, "bb": 21}
with open("myfile1.txt", "w") as file:
	file.write(str(contents))	# writes a string to a file

import json
with open("myfile2.json", "w") as file:
	file.write(json.dumps(contents))	# writes an object to a file

# Reading from a file
with open("myfile1.txt") as file:
	contents = file.read()		# reads a string from a file
print(contents)
# print: {'aa': 12, 'bb': 21}

with open("myfile2.json", "r") as file:
	contents = json.load(file)	# reads a json object from a file
print(contents)
# print: {'aa': 12, 'bb': 21}

