package lesson_18;

public class InterCityBus extends Bus {
    private String[] cities;
    private int placeBicycle;
    private int countBicycle;


    public InterCityBus(String model, int year, int capacity, int placeBicycle) {
        super(model, year, capacity);

        this.placeBicycle = placeBicycle;
        cities = new String[2];
    }

    public InterCityBus(String model, int year, int capacity, String[] cities, int placeBicycle) {
        super(model, year, capacity);
        this.cities = cities;
        this.placeBicycle = placeBicycle;
    }

    public boolean takePassengerWithBicycle() {
        if (getCapacity() > getCountPassengers() && placeBicycle > countBicycle) {
            this.takePassenger();
            countBicycle++;
            return true;
        }
        System.out.println("Place for passengers with bicycle is full for bus " + this.getModel());
        return false;

    }

    public boolean dropOffPassengerWithBicycle(){
        int passengers = this.getCountPassengers();
        if (passengers > 0 && this.countBicycle > 0){
            countBicycle--;
            setCountPassengers(passengers - 1);
            System.out.println("Passenger with bicycle get out from bus " + this.getModel());
            return  true;
        }
        System.out.println("No passengers  with bicycle in bus " + this.getModel());
        return  false;
    }

    public String[] getCities() {
        return cities;
    }

    public int getPlaceBicycle() {
        return placeBicycle;
    }
}
