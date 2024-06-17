package lesson_24.enums;

public enum Planet {
    MERCURY(3.1321e+20, 2.33435e+10),
    VENUS(5.532e+28, 8.432e+12);


    private final double mass;
    private final double radius;

    Planet(double mass, double radius){
        this.mass = mass;
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }
}
