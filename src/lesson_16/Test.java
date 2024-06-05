package lesson_16;


public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("Archi", 30);

        dog.overcomeTheBarrier(60);

        dog.overcomeTheBarrier(40);

        System.out.println(dog.counter);

    }
}
