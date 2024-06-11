package lesson_19;

import java.util.Arrays;

public class AutoPark {
    public static void main(String[] args) {
        BusDriver busDriver = new BusDriver("LN-12495431");

        Autobus autobus = new Autobus(busDriver, 20);

        System.out.println(autobus.toString());

        BusDriver busDriver1 = new BusDriver("AE-232132");

        autobus.setDriver(busDriver1);

        System.out.println(busDriver.toString());
        System.out.println(autobus.toString());
        System.out.println(busDriver1.toString());

        Autobus bus2 = new Autobus(busDriver, 3);
        System.out.println(bus2.toString());


        Passenger passenger = new Passenger("John");
        Passenger passenger1 = new Passenger("Margo");
        Passenger passenger2 = new Passenger("Peter");
        Passenger passenger3 = new Passenger("Sebastian");
        Passenger passenger4 = new Passenger("Hanna");

        bus2.takePassenger(passenger);
        System.out.println("bus2.getCountPassenger(): " + bus2.getCountPassenger());

        bus2.takePassenger(passenger1);
        bus2.takePassenger(passenger);


        bus2.takePassenger(new Passenger("Test"));

        System.out.println(bus2.takePassenger(passenger2));

        System.out.println(bus2.getCountPassenger());

        bus2.dropOffPassenger(passenger1);

        System.out.println(bus2.getCountPassenger());

        System.out.println(bus2.getPassengerList());


    }
}
