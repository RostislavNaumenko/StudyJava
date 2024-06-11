package lesson_19;

public class BusDriver {
    private String lincenseNumber;
    private Autobus autobus;

    public BusDriver(String lincenseNumber) {
        this.lincenseNumber = lincenseNumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("BusDriver{");
        sb.append(lincenseNumber).append("; bus: ");
        sb.append(autobus != null ? autobus.getId() : "out of bus");
        sb.append("}");

        return sb.toString();
//        return "BusDriver{" +
//                "lincenseNumber='" + lincenseNumber + '\'' +
//                ", autobus=" + autobus.getId() +
//                '}';
    }

    public Autobus getAutobus() {
        return autobus;
    }

    public void setAutobus(Autobus autobus) {
        this.autobus = autobus;
    }

    public String getLincenseNumber() {
        return lincenseNumber;
    }

    public void setLincenseNumber(String lincenseNumber) {
        this.lincenseNumber = lincenseNumber;
    }
}
