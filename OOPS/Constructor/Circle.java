public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
        this(1.0);
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
