package lesson_21;

public class Car extends VehicleWithEngine{

        public Car (Engine engine){
            super();
            this.setEngine(engine);
        }


    @Override
    public String toString() {
        return "Car{id: }" + getId() + "; engine: " + getEngine();
    }
}
