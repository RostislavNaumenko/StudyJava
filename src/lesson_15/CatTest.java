package lesson_15;

public class CatTest {
    public static void main(String[] args) {
        Cat15 cat = new Cat15("Simka", 8, 4);

        cat.meow();


        cat.setAge(11);
        System.out.println("Age: " + cat.getAge());
    }
}
