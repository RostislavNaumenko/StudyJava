package lesson_22;

public class Journey {
    String name;
    int number;

    public Journey(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Journey{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }


}
