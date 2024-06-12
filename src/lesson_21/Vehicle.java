package lesson_21;

public abstract class Vehicle {

    private final int id;
    private static int counterId;

    private Engine engine;

    public Vehicle(){
        this.id = ++counterId;
    }

    public abstract void startEngine();

    public abstract  void stopEngine();

    public int getId(){
        return id;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", engine=" + engine +
                '}';
    }
}
