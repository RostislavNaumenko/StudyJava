package homework_20.vehicle;

public class StartEngineTest {
    public static void main(String[] args) {

        Vehicle transport = new Car();
        Vehicle transport1 = new Motorcycle();
        Vehicle transport2 = new Bicycle();

        transport.startEngine();


        Vehicle[] transports = new Vehicle[3];

        transports[0] = transport;
        transports[1] = transport1;
        transports[2] = transport2;

        for (int i = 0; i < transports.length; i++) {

            transports[i].startEngine();

        }

    }
}
