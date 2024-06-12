package homework_21;

public class Triangle extends Shape{
    private int side1;
    private int side2;
    private int side3;

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double findPermit() {
        return side1 + side2 + side3;
    }

    @Override
    public double findArea() {
        double halfOfPermit = findPermit() / 2;

        return Math.sqrt(halfOfPermit*(halfOfPermit - side1) * (halfOfPermit - side2) * (halfOfPermit - side3));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1= " + side1 +
                ", side2= " + side2 +
                ", side3= " + side3 +
                ", area= " + findArea() +
                ", permit= " + findPermit() +
                '}';
    }

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public int getSide3() {
        return side3;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }


}
