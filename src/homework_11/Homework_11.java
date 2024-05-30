package homework_11;

import java.util.Arrays;

/**
 * Task 1
 * Написать метод, который считает сумму всех элементов в массиве.
 * <p>
 * Task 2
 * Написать метод, который находит среднее значение элементов в массиве (среднее арифметическое).
 * <p>
 * Task 3
 * Написать метод, который проверяет, является ли массив палиндромом (читается одинаково с обоих концов).
 * <p>
 * Task 4
 * Написать метод, который удаляет все вхождения заданного числа из массива и возвращает новый массив без этого числа.
 */

public class Homework_11 {
    public static void main(String[] args) {

        int[] array = {0, 1, 2, 3, 3, 2, 1, 0};

        System.out.println(sumOfNumbersInArray(array));
        System.out.println(averageOfArrayElements(array));
        System.out.println(checkArrayPalindrome(array));
        System.out.println(Arrays.toString(deleteNumFromArray(array, 2)));

    }

    //Task 1
    public static int sumOfNumbersInArray(int[] array) {

        if (checkDecimalArray(array)) {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            return sum;
        } else {
            return Integer.MIN_VALUE; //Не знаю что вернуть если у нас массив пустой или null
        }
    }

    //Task 2
    public static double averageOfArrayElements(int[] array) {

        if (checkDecimalArray(array)) {
            return (double) sumOfNumbersInArray(array) / array.length;
        }

        return Integer.MIN_VALUE; //Не знаю что вернуть если у нас массив пустой или null

    }

    //Task 3

    public static boolean checkArrayPalindrome(int[] array) {

        if (array == null || array.length == 0) {
            return false;  // Возвращаем false, если массив пустой или null
        }

        int startIndex = 0;
        int endIndex = array.length - 1;

        while (startIndex <= endIndex) {
            if (array[startIndex] != array[endIndex]) {
                return false;
            }
            startIndex++;
            endIndex--;
        }
        return true;
    }

    //Task 4

    public static int[] deleteNumFromArray(int[] array, int value) {
        int[] arr;

        if (checkDecimalArray(array)) {

            int counter = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == value) {
                    counter++;
                }
            }

            if (counter == 0) return array;
            if (counter == array.length) return new int[0];

            arr = new int[array.length - counter];
            int j = 0;

            for (int i = 0; i < array.length; i++) {
                if (array[i] != value) {
                    arr[j] = array[i];
                    j++;
                }

            }

        } else {
            return new int[0];
        }
        return arr;
    }


    public static boolean checkDecimalArray(int[] array) {
        return array != null && array.length != 0;

    }


}

