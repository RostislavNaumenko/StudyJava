package lesson_28;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorApp {
    public static void main(String[] args) {
        int[] ints = new int[] {1,2,0,5,9};
        Arrays.sort(ints);

        System.out.println(Arrays.toString(ints));


        Car[] cars = new Car[4];

        cars[0] = new Car("BMW", 2021, 230);
        cars[1] = new Car("Audi", 2019, 250);
        cars[2] = new Car("Alfa Romeo", 2015, 230);
        cars[3] = new Car("Mercedes", 2015, 240);

        System.out.println(Arrays.toString(cars));

        Arrays.sort(cars);

        System.out.println(Arrays.toString(cars));

        CarSpeedComparator carSpeedComparator = new CarSpeedComparator();

        Arrays.sort(cars, carSpeedComparator);

        System.out.println(Arrays.toString(cars));

        CarModelComparator carModelComparator = new CarModelComparator();

        Arrays.sort(cars, carModelComparator);

        System.out.println(Arrays.toString(cars));

        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                int yearCompare = Integer.compare(car1.getYear(), car2.getYear());

                if (yearCompare == 0){
                    return car2.getModel().compareTo(car1.getModel());
                }else {
                    return yearCompare;
                }
            }
        });
        System.out.println("\n======================\n");

        System.out.println(Arrays.toString(cars));

        //Лямбда - выражения
        Arrays.sort(cars, (car1, car2) -> {
            int yearCompare = Integer.compare(car1.getYear(), car2.getYear());

            if (yearCompare == 0){
                return car2.getModel().compareTo(car1.getModel());
            }else {
                return yearCompare;
            }
        });

        Arrays.sort(cars, (car1, car2) -> {
            return car2.getYear() - car1.getYear();
        });

        Arrays.sort(cars, (car1, car2) -> car2.getYear() - car1.getYear());

        Arrays.toString(cars);


        Comparator<Car> byModel = Comparator.comparing(Car::getModel);

        Arrays.sort(cars, byModel);
        System.out.println(Arrays.toString(cars));

        //Без преобразования типов
        Arrays.sort(cars, Comparator.comparingInt(Car::getMaxspeed));

        //Сортировка в обратном порядке
        Arrays.sort(cars, Comparator.comparing(Car::getMaxspeed, Comparator.reverseOrder()));
        //Альтернативное написание
        Arrays.sort(cars, Comparator.comparing(Car::getMaxspeed).reversed());

        //Сортировка с учитыванием равенства
        Arrays.sort(cars, Comparator.comparing(Car::getYear).thenComparing(Car::getModel));

        System.out.println(Arrays.toString(cars));

        Arrays.sort(cars, Comparator.comparing(Car::getYear).thenComparing(Car::getMaxspeed, Comparator.reverseOrder()));

        System.out.println(Arrays.toString(cars));
    }


}
