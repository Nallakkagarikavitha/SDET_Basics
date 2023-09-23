import math

# Input: Radius of the circle
radius = float(input("Enter the radius of the circle: "))

# Calculate diameter, circumference, and area
diameter = 2 * radius
circumference = 2 * math.pi * radius
area = math.pi * radius ** 2

# Display the results
print(f"Diameter of the circle: {diameter}")
print(f"Circumference of the circle: {circumference}")
print(f"Area of the circle: {area}")
