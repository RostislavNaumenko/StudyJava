package lesson_20.animal;

public class CastingExample {
    public static void main(String[] args) {
        Animal animal = new Hamster();

        Animal animal1 = new Cat();

        Animal animal2 = new Dog();

        animal.voice();

        Animal[] animals = new Animal[3];
        animals[0] = animal;
        animals[1] = animal1;
        animals[2] = animal2;

        Cat catLink = (Cat) animal1;

        for (int i = 0; i <animals.length ; i++) {

            if(animals[i] instanceof Cat){
                Cat temp = (Cat) animals[i];
                temp.voice();
            }

            if(animals[i] instanceof Hamster){
                Hamster temp = (Hamster) animals[i];
                temp.voice();
            }
        }


    }
}
