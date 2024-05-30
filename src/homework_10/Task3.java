package homework_10;

import java.util.Arrays;

/**
 * Task 3
 * Написать метод, принимающий на вход массив целых чисел.
 * Метод должен вернуть массив, состоящий только из простых чисел, присутствующих в изначальном массиве
 * <p>
 * вход -> {0, 13, -25, 11, 31, 55, 98, 11, 5} -> выход {13, 11, 31, 11, 5}
 */

public class Task3 {
    public static void main(String[] args) {
        int[] array = {0, 13, -25, 11, 31, 55, 98, 11, 5};

        System.out.println(Arrays.toString(arrayWithOnlySimpleNumbers(array)));
    }

    public static int[] arrayWithOnlySimpleNumbers(int[] array) {

        int[] methodArray; // массив с простыми числами
        int counter = 0; // подсчет простых чисел для создания массива

        //проверка на пустой массив
        if (array != null && array.length != 0) {
            // Подсчет простых чисел
            for (int i = 0; i < array.length; i++) {
                if (checkerSimpleNumbers(array[i])) {

                    counter++;
                }
            }
            // Задаем длинну нашему массиву с простыми числами
            methodArray = new int[counter];

            //Переменная для правильного заполнения масиива
            int arrayCounter = 0;

            //Не знаю как избавиться от еще одного прохода проверок для заполнения массива
            for (int i = 0; i < array.length; i++) {
                if (checkerSimpleNumbers(array[i])) {

                    methodArray[arrayCounter] = array[i];

                    arrayCounter++;
                }
            }
            return methodArray;

        } else {
            // Заглушка на пустой массив
            return new int[] {0};
        }

    }

    // Проверка чисел
    public static boolean checkerSimpleNumbers(int number) {
        if (number < 2) return false;

        if (number == 2 || number == 3) return true;

        if (number % 2 == 0 || number % 3 == 0) return false;

        for (int i = 5; i <= Math.sqrt(number); i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) return false;

        }

        return true;
    }
}
