package lesson_18;

import java.util.Arrays;

public class TransportApp {
    public static void main(String[] args) {
        Bus bus = new Bus("Bus-M1", 2019, 4);

        bus.toString();

        bus.takePassenger();
        bus.takePassenger();
        bus.takePassenger();
        bus.takePassenger();
        bus.takePassenger();

        System.out.println(bus.getCapacity());

        bus.dropPassenger();
        bus.dropPassenger();
        bus.dropPassenger();

        System.out.println(bus.getCountPassengers());

        System.out.println("\n===========================\n");

        InterCityBus interCityBus = new InterCityBus("Mercedes",2022,3, new String[]{"Munchen", "Berlin"}, 2);

        interCityBus.start();
        System.out.println(interCityBus.toString());
        System.out.println(Arrays.toString(interCityBus.getCities()));

        interCityBus.takePassenger();
        interCityBus.takePassengerWithBicycle();
        interCityBus.takePassengerWithBicycle();
        interCityBus.takePassengerWithBicycle();

        interCityBus.dropOffPassengerWithBicycle();

        System.out.println(interCityBus.getCountPassengers());



    }
}
