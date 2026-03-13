# Filename: AreaHalf3.py
# Program that calculates and prints the area
# of a circle and half circle

pi = 3.1416	# mathematical constant PI
radius = float(input("Enter a circle's radius: "))	# get radius

# calculate the area of the whole circle
area = pi * radius * radius

print("The area of a circle with a radius of", radius, "is %.2f" % area)
print("The area of one-half that circle is %.2f" % (area / 2))
