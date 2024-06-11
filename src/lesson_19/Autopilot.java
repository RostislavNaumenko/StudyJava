package lesson_19;

public class Autopilot {
    private String softwareVer;

    public Autopilot(String softwareVer) {
        this.softwareVer = softwareVer;
    }

    @Override
    public String toString() {
        return "Autopilot{" +
                "softwareVer='" + softwareVer + '\'' +
                '}';
    }

    public String getSoftwareVer() {
        return softwareVer;
    }

    public void setSoftwareVer(String softwareVer) {
        this.softwareVer = softwareVer;
    }
}
