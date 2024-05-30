package homework_08;


import java.util.Random;

/**
 * Task 3
 * Создать массив целых чисел произвольной длины от 5 до 15.
 * Заполнить массив случайными значениями от -50 до 50.
 * Вывести на экран:
 * Минимальное значение в массиве
 * Максимальное значение в массиве
 * Среднее арифметическое всех значений в массиве
 * */

public class Task3 {
    public static void main(String[] args) {

        Random random = new Random();

        int arrayLength = random.nextInt(15 - 5 + 1) + 5;

        System.out.println("arrayLength: " + arrayLength);

        int [] arr = new int[arrayLength];

        System.out.print("[");
        for (int i = 0; i < arrayLength; i++){
            arr[i] = (int) ( + Math.random() * 100 - 50);
            System.out.print(arr[i] + ((i < arrayLength - 1) ? "," : "]\n"));
        }

        int min = arr[0];
        int max = arr[0];
        int average = arr[0];

        for (int i = 1; i < arrayLength; i++){
            average += arr[i];

            if(arr[i] < min){
                min = arr[i];
            }
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Min: " + min + " | " + "Max: " + max + " | " + "Average: " + average/arrayLength);

    }
}
