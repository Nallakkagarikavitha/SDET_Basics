class CircleComp:
    def __init__(self, radius):
        self.radius = radius

    def calculate_circumference(self):
        circumference = 2 * 3.14159 * self.radius
        return circumference

    def calculate_area(self):
        area = 3.14159 * self.radius ** 2
        return area


# Example usage:
if __name__ == "__main__":
    radius = float(input("Enter the radius of the circle: "))
    circle = CircleComp(radius)

    circumference = circle.calculate_circumference()
    area = circle.calculate_area()

    print(f"The circumference of the circle is: {circumference:.2f}")
    print(f"The area of the circle is: {area:.2f}")
