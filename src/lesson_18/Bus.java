package lesson_18;

public class Bus extends Vehicle{
    private int capacity;
    private int countPassengers;


    public Bus(String model, int year, int capacity){
        super(model, year);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public void setCountPassengers(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    public boolean takePassenger(){
        if (countPassengers < capacity){
            countPassengers++;
            System.out.println("Passenger come in to bus " + this.getModel());
            return true;
        }else{
            System.out.println(this.getModel() + " is full");
            return false;
        }
    }

    public boolean dropPassenger(){
        if(countPassengers > 0){
            countPassengers--;
            System.out.println("Passenger got out from bus " + this.getModel());
            return true;
        }
        System.out.println("No passengers in bus " + this.getModel());
        return false;
    }
}
