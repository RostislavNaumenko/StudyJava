package homework_09;

import java.util.Random;

/**
 * Task 3
 * Заполните массив 50 случайными числами от 1 до 100.
 * Программа должна найти, и вывести на экран все простые числа.
 * Посчитайте сколько получилось таких чисел в массиве.
 * Простое число - число, которое делится на цело только на 1 и само себя.
 *
 * Пример простых чисел: 3, 5, 7, 11, 13 и т.д.
 * */

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[50];

        System.out.print("[");
        for (int i = 0; i < array.length; i++){

            array[i] = random.nextInt(101);

            System.out.print(array[i] + ((i < array.length - 1)? "," : "]\n"));
        }

        finderForSimpleNumbers(array);

    }

    public static void finderForSimpleNumbers(int[] arr){

        if (arr != null){
            for (int i = 0; i < arr.length; i++){
                if ( checkerSimpleNumbers(arr[i])){
                    System.out.print(arr[i] + ",");
                }
            }
        }else {
            System.out.println("Невозможно обработать пустой массив");
        }


    }

    public  static boolean checkerSimpleNumbers (int number){
        if(number < 2) return false;
        for(int i = 2; i <= number / 2; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
