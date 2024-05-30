package homework_10;

import java.util.Arrays;

/**
 *Написать свой метод copyOfArray, дублирующий функционал метода Arrays.copyOf()
 *
 * на вход принимает массив целых чисел и число - длинну нового массива.
 * Метод должен создать и распечатать массив заданной в параметрах длинны.
 * В начало массива должны быть скопированы элементы из входящего массива:
 *
 * {0, 1, 2, 3, 4 , 5, 6} -> copyOfArray(array, 3) -> вывод на печать {0, 1, 2}
 *
 * Arrays.copyOf() использовать нельзя. Суть задачи - написать собственную реализацию этого метода
 * */

public class Task1 {
    public static void main(String[] args) {

        int[] array = {0, 1, 2, 3, 4 , 5, 6};
        int newArrayLength = 10;

        copyOfByHands(array, newArrayLength);
    }

    public static void copyOfByHands(int[] arr, int arrayLength){
        int[] methodArray = new int[arrayLength];


                for (int i = 0; i < arrayLength && i < arr.length; i++) {
                        methodArray[i] = arr[i];
                }

        System.out.println(Arrays.toString(methodArray));

    }

}
