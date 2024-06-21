package lesson_28;

public class Car implements Comparable<Car>{
    private String model;
    private int year;
    private int maxspeed;

    public Car(String model, int year, int maxspeed) {
        this.model = model;
        this.year = year;
        this.maxspeed = maxspeed;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", maxspeed=" + maxspeed +
                '}';
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
    }

    @Override
    public int compareTo(Car car) {
        return this.maxspeed - car.year;
    }
}
