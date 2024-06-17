package homework_24;

public class SeasonsApp {
    public static void main(String[] args) {
        Seasons seasons = Seasons.WINTER;

        System.out.println(seasons.getTemperature());

        double average = seasons.getAverageTemperature();

        System.out.println(average);

        Seasons seasons1 = Seasons.SUMMER;

        System.out.println(seasons1.getTemperature());

        double av = seasons1.getAverageTemperature();

        System.out.println(av);
    }
}
