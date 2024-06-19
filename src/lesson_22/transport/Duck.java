package lesson_22.transport;

public class Duck implements Flyable, Swimable{
    private String color;

    public Duck(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void fly() {
        System.out.println("Утка " + color + "летит");
    }

    @Override
    public void swim() {
        System.out.println("Утка "+ color + "плывет");
    }
}
