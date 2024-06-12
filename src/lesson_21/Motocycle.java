package lesson_21;

public class Motocycle extends VehicleWithEngine {

    public Motocycle(Engine engine) {
        super();
        setEngine(engine);
    }

    @Override
    public String toString() {
        return "Motocycle{id:"+ getId() + "; engine: " + getEngine() + " }";
    }

    @Override
    public void startEngine() {

    }

    @Override
    public void stopEngine() {

    }
}
