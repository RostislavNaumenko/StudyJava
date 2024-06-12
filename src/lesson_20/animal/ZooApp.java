package lesson_20.animal;

public class ZooApp {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.voice();

        Cat cat = new Cat();
        cat.eat();
        cat.voice();

        Dog dog = new Dog();

        Hamster hamster = new Hamster();
        hamster.voice();
    }
}
