package homework_09;

import java.util.Random;

/**
 *Написать метод, принимающий массив целых чисел и распечатывающий массив в обратной последовательности.
 *
 * {1, 4, 3, 6, 7} -> распечатывает [7, 6, 3, 4, 1]
 *
 * Перегрузить метод, если в него приходит индекс, то часть массива слева до этого индекса распечатывается в обычном порядке,
 * а начиная с этого индекса в обратном:
 *
 * {1, 4, 3, 6, 7} + индекс 2 - > распечатывает [1, 4, 7, 6, 3]
 *
 * Еще одна перегрузка: метод принимает массив и булевый флаг. Если флаг == true -> печатает массив в обратном порядке
 * Если флаг == false -> печатает массив в прямом порядке
 * */

public class Task1 {
    public static void main(String[] args) {

        Random random = new Random();

        int[] array = new int[5];

        System.out.print("[");
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(101);
            System.out.print(array[i] + ((i < array.length - 1) ? "," : "]\n"));
        }

        printReversedArray(array);

        printReversedArray(array, 7);

        printReversedArray(array, true);

    }

    public static void printReversedArray (int[] arr){

        System.out.print("Массив в обратной последовательности: [");
        for (int i = arr.length - 1; i >= 0; i--){

            System.out.print(arr[i] + ((i != 0) ? "," : "]\n"));

        }
    }

    public static void printReversedArray (int[] arr, int index){

        System.out.print("Массив в обратной последовательности после индекса: ");
        if (index < arr.length){
            System.out.print("[");
            for (int i = 0; i < index; i++){

                System.out.print(arr[i] + ",");

            }
            for (int i = arr.length - 1; i >= index; i--){

                System.out.print(arr[i] + ((i != index) ? "," : "]\n"));
            }
        }else {
            System.out.println("Индекс больше длинный массива");
        }


    }

    public static void printReversedArray (int[] arr, boolean bool){

        System.out.print("Массив с зависимостью от boolean: [");
        if (bool){

            for (int i = arr.length - 1; i >= 0; i--){

                System.out.print(arr[i] + ((i != 0) ? "," : "]\n"));

            }

        }else {
            for (int i = 0; i < arr.length; i++){

                System.out.print(arr[i] + ((i < arr.length - 1) ? "," : "]\n"));

            }
        }

    }
}
