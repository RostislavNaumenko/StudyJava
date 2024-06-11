package lesson_19;

public class Autobus {
    private static int counter = 1;

    private final int id;
    BusDriver driver;
    Autopilot autopilot;
    private final int capacity;

    private final Passenger[] passengers;
    private int counterPassengers;


    public Autobus(BusDriver driver, int capacity) {
        this.driver = driver;
        driver.setAutobus(this);
        this.capacity = capacity;
        this.autopilot =  new Autopilot("AP-939");
        this.id = counter++;
        this.passengers = new Passenger[capacity];
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder("Autobus{");
        sb.append(id).append("; driver: ");
        sb.append(driver != null ? driver : "no driver; ");
        sb.append(" autopilot: ").append(autopilot.toString());
        sb.append("; capacity: " + capacity);
        sb.append("}");

        return sb.toString();
    }

    public String getPassengerList(){
        if(counterPassengers == 0) return "No passengers";

        StringBuilder sb = new StringBuilder("[");

        for (int i = 0; i < passengers.length; i++) {
            if(passengers[i] != null){
                Passenger temp = passengers[i];
                sb.append("Passenger: {id: ").append(temp.getId());
                sb.append("; name: ").append(temp.getName());
                sb.append(" }").append(";");
            }

        }
        sb.append("]");
        return sb.toString();
    }

    public boolean takePassenger(Passenger passenger){
        if (passenger == null) return false;

        if(counterPassengers < capacity){

            if(isPassengerInBus(passenger) != -1){
                System.out.println("Passenger: " + passenger.getName() + " already in bus " + this.id);
                return false;
            }
            this.passengers[counterPassengers] = passenger;
            counterPassengers++;
            System.out.println("Passenger " + passenger.getName() + " come in to bus: " + this.id);
            return true;
        }
        System.out.println("In bus: " + this.id + " no more space ");
        return false;
    }

    private int isPassengerInBus(Passenger passenger) {

        for (int i = 0; i < counterPassengers; i++) {
            if(passengers[i].getId() == passenger.getId()){
                return  i;
            }
            
        }

        return -1;
    }

    public boolean dropOffPassenger(Passenger passenger){
        if (counterPassengers == 0) return false;

        int idPassenger = isPassengerInBus(passenger);

        if(idPassenger!= -1){

            for (int i = idPassenger; i < counterPassengers - 1; i++) {
                passengers[i] = passengers[i + 1];

            }
            counterPassengers--;
            System.out.printf(" %s get out from bus \n", passenger.toString());

            return true;
        }

        System.out.println("Passenger not in bus");
        return  false;
    }


    public int getCountPassenger() {
        return counterPassengers;
    }

    public int getId() {
        return id;
    }

    public BusDriver getDriver() {
        return driver;
    }

    public BusDriver setDriver(BusDriver driver){
        this.driver.setAutobus(null);
        driver.setAutobus(this);
       return this.driver = driver;
    }

    public int getCapacity() {
        return capacity;
    }
}
