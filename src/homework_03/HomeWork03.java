package homework_03;

import java.util.Scanner;

class HomeWork {
    void task() {
        System.out.println("HelloWorld");
    }
}

public class HomeWork03 {
    public static void main(String[] args) {
        HomeWork validation = new HomeWork();

        validation.task();

        //Task 1
        String myName = "Rostyslav";
        int myAge = 19;
        double milkPrice = 1.2;

        //Task 2
        int firstValue = 0;
        int secondValue = 1;
        int thirdValue = 2;
        int fourthValue = 3;

        int averageValue = (firstValue + secondValue + thirdValue + fourthValue)/4;
        int theRest = (firstValue + secondValue + thirdValue + fourthValue)%4;
        System.out.println("Task 2 ");
        System.out.println("Среднее арифметическое: " + averageValue);
        System.out.println("Остаток: " + theRest + "\n");


        //Task 3
        int firstProduct = 1000;
        int secondProduct = 500;

        double discount = (firstProduct + secondProduct) * 0.1;
        double  productsWithDiscount = (firstProduct + secondProduct) - discount;

        System.out.println("Task 3");
        System.out.println("Соимость товаров со скидкой: " + productsWithDiscount);
        System.out.println("Скидка: " + discount + "\n");


        //Task 4

        int temperatureMonday = 16;
        int temperatureTuesday = 20;
        int temperatureWednesday = 18;
        int temperatureThursday = 17;
        int temperatureFriday = 17;
        int temperatureSaturday = 22;
        int temperatureSunday = 22;

        double averageTemperature = (double) (temperatureMonday + temperatureTuesday + temperatureWednesday + temperatureThursday + temperatureFriday + temperatureSaturday + temperatureSunday) /7;
        System.out.println("Task 4");
        System.out.println("Средняя температура за неделю: " + averageTemperature + "\n");


        //Task 5 (Theory)
        System.out.println("Task 5 (Theory)");
        System.out.println("Остаток от деления какого-либо целого числа на 2 : 1");
        System.out.println("Остаток от деления какого-либо целого числа на 3 : 1, 2 \n");


        //Task 4 FOR FUN :))))))
        System.out.println("Task 4 FOR FUN :)))");
        Scanner input = new Scanner(System.in);
        int arrLength = input.nextInt();
        int [] arr = new int [arrLength];

        int[] weekTemperature = new int[7];
        System.out.println("Введите температуру для дней недели (целые числа)");
        for (int i = 0; i < arrLength; i++){
            switch (i) {
                case 0: {
                    System.out.println("Понедельник: ");
                    weekTemperature[0] = input.nextInt();
                    break;
                }
                case 1: {
                    System.out.println("Вторник: ");
                    weekTemperature[1] = input.nextInt();
                    break;
                }
                case 2: {
                    System.out.println("Среда: ");
                    weekTemperature[2] = input.nextInt();
                    break;
                }
                case 3: {
                    System.out.println("Четверг: ");
                    weekTemperature[3] = input.nextInt();
                    break;
                }
                case 4: {
                    System.out.println("Пятница: ");
                    weekTemperature[4] = input.nextInt();
                    break;
                }
                case 5: {
                    System.out.println("Суббота: ");
                    weekTemperature[5] = input.nextInt();
                    break;
                }
                case 6: {
                    System.out.println("Воскресенье: ");
                    weekTemperature[6] = input.nextInt();
                    break;
                }

            }
        }
        int averageTemperatureForFun = 0;
        for (int i = 0; i < weekTemperature.length; i++){
            averageTemperatureForFun += weekTemperature[i];
        }
        averageTemperatureForFun /= 7;
        System.out.println("Средняя температура за неделю: " + averageTemperatureForFun);

    }

}
