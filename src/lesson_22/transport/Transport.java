package lesson_22.Transport;

public abstract class Transport {
    protected int capasity;

    public Transport(int capasity){
        this.capasity = capasity;
    }

    abstract void takepassenger();

    public int getCapasity() {
        return capasity;
    }
}
