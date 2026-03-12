# Let's just make a variable
some_var = 5

# Here is an if statement. Indentation is significant in Python!
# Convention is to use four spaces, not tabs.
# This prints "some_var is smaller than 10"
if some_var > 10:
	print("some_var is totally bigger than 10.")
elif some_var < 10:
	print("some_var is smaller than 10.")
else:
	print("some_var is indeed 10.")

# Match/Case - introduced in Python 3.10
# It compares a value against multiple patterns and executes the matching case block.

command = "run"

match command:
	case "run":
		print("The robot started to run 🏃‍♂️")
	case "speak" | "say_hi":	# multiple options (OR pattern)
		print("The robot said hi 🗣️")
	case code if command.isdigit():	# conditional
		print(f"The robot execute code: {code}")
	case _:		# _ is a wildcard that never fails (like default/else)
		print("Invalid command ❌")

# Output: "The robot started to run 🏃‍♂️"