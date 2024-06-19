package lesson_22.Transport;

public class Boat extends Transport implements Swimable{


    public Boat(int capasity) {
        super(capasity);
    }

    @Override
    public void swim() {
        System.out.println("Корабль плывет");

    }

    @Override
    void takepassenger() {
        System.out.println("Корабль берт пассажиров на борт");
    }
}
