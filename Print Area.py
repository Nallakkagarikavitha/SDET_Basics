import math


def calculate_circle_area(radius):
    # Calculate the area of the circle using the formula: PI * radius^2
    area = math.pi * radius ** 2
    return area


def main():
    try:
        # Input the radius from the user
        radius = float(input("Enter the radius of the circle: "))

        # Calculate the area
        area = calculate_circle_area(radius)

        # Print the result
        print(f"The area of the circle with radius {radius} is: {area:.2f}")

    except ValueError:
        print("Invalid input. Please enter a valid numeric value for the radius.")


if __name__ == "__main__":
    main()
