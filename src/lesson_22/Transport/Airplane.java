package lesson_22.Transport;

public class Airplane extends Transport implements Flyable{

    public Airplane(int capasity) {
        super(capasity);
    }

    @Override
    public void fly() {
        System.out.println("Самолет летит");
    }

    @Override
    void takepassenger() {
        System.out.println("Самолет берет пассажиров на борт");
    }
}
