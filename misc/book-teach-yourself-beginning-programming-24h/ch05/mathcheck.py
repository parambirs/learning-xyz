# Program that asks for two numbers
# and then performs various math operations on them

# Two input statements to get the numbers and convert the entries
# into floating-point numbers
a = float(input("Enter the first num: "))
b = float(input("Enter the second num: "))

c = a + b
print(a, '+', b, '=', c)

c = a - b
print(a, '-', b, '=', c)

c = a * b
print(a, '*', b, '=', c)

c = a / b
print(a, '/', b, '=', c)

c = a % b
print(a, '%', b, '=', c)

c = a ** b
print(a, '^', b, '=', c)
