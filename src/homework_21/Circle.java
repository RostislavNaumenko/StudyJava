package homework_21;

public class Circle extends Shape{
    private static final double PI = 3.14;

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double findPermit() {
        return 2*PI*radius;
    }

    @Override
    public double findArea() {
        return PI*Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }

    public double setRadius(double radius) {
        this.radius = radius;
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius= " + radius +
                ", area= " + findArea() +
                ", permit= " + findPermit() +
                '}';
    }
}
