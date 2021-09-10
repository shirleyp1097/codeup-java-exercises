package shapes;

public class Circle {
    private static double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public static double getArea() {
        double area = Math.PI * (radius * radius);
        return area;
    }

    public static double getCircumference() {
        double circumference = 2 * Math.PI * radius;
        return circumference;
    }
}
