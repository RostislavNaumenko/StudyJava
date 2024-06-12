package homework_21;

public class Test {
    public static void main(String[] args) {
        Shape circle = new Circle(5);

        Shape triangle = new Triangle(4,5,6);

        Shape rectangle = new Rectangle(5, 9);

        Shape[] shapes = new Shape[3];

        shapes[0] = circle;
        shapes[1] = triangle;
        shapes[2] = rectangle;

        for (Shape shape : shapes) {
            System.out.println(shape.findArea());
            System.out.println(shape.findPermit());
        }

    }
}
