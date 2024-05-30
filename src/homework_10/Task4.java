package homework_10;

import java.util.Arrays;

/**
 * Массив 1 - {100, 112, 256, 349, 770}
 * Массив 2 - {72, 86, 113, 119, 265, 445, 892}
 * k = 7
 * */
public class Task4 {
    public static void main(String[] args) {

        int[] array1 = {100, 112, 256, 349, 770};
        int[] array2 = {72, 86, 113, 119, 265, 445, 892};

        int k = 7;

        int[] array = new int[array1.length + array2.length];

        int j = 0;

        // "Склеивание" массивов (можно вывести в метод)
        for (int i = 0; i < array1.length + array2.length; i++) {
            if(i < array1.length){
                array[i] = array1[i];
            }else {
                array[i] = array2[j];
                j++;
            }

        }

        //Сортировка вставками (можно вывести в метод)
        for (int i = 1; i < array.length; i++) {
            int swap = array[i];

            for (j = i; j > 0 && swap < array[j - 1]; j--){
                array[j] = array[j - 1];
            }
            array[j] = swap;
        }

        System.out.println(Arrays.toString(array));

        System.out.println("Искаемое число: " + array[k - 1]);

    }
}
