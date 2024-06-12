package homework_21;

import javax.swing.*;
import java.beans.JavaBean;

public class Rectangle extends Shape{
    private int side1;
    private int side2;

    public Rectangle(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double findPermit() {
        return (side1 + side2) * 2;
    }

    @Override
    public double findArea() {
        return (side1 * side2);
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


    @Override
    public String toString() {
        return "Rectangle{" +
                "side1= " + side1 +
                ", side2= " + side2 +
                ", area= " + findArea() +
                ", permit= " + findPermit() +
                '}';
    }
}
