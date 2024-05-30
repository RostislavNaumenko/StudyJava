package homework_08;

/**
 * Дан массив целых чисел. Поменять местами элементы с максимальным и минимальным значениями.
 * Пример:
 * { 5, 6, -25, 0, 31, -15 } -> { 5, 6, 31, 0, -25, -15 }
 *
 * */

public class Task4 {
    public static void main(String[] args) {

        int[] array = { 5, 6, -25, 0, 31, -15 };

        int min = array[0];
        int max = array[0];

        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < array.length; i++){

            if(array[i] < min){
                min = array[i];
                minIndex = i;
            }
            if (array[i] > max){
                max = array[i];
                maxIndex = i;
            }
        }
        array[minIndex] = max;
        array[maxIndex] = min;

        System.out.print("[");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + ((i < array.length - 1) ? "," : "]"));
        }
    }
}
