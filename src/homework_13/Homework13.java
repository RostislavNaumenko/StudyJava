package homework_13;

/*
Task 1
Сумма четных чисел
Напишите метод, который вычисляет сумму всех четных чисел в массиве.

Task 2
Найти второе по величине число в массиве
Напишите метод, который находит второе по величине число в массиве целых чисел.

*/

public class Homework13 {

    public static void main(String[] args) {

        int[] array = {1, 5, 4, 12, 12, 20, 10, 20};

        System.out.println(sumOfEvenElements(array));

        System.out.println(secondBiggestElement(array));

    }

    public static int sumOfEvenElements (int[] array){
        if(array == null) return Integer.MIN_VALUE;

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0){
                sum += array[i];
            }
        }
        return sum;
    }

    public  static int secondBiggestElement (int[] array){
        if(array == null) return Integer.MIN_VALUE;

        if (array.length == 0) return Integer.MIN_VALUE;

        int biggestElem = array[0];
        int secondBiggestElem = array[0];

        for (int i = 0; i < array.length; i++) {
            if(biggestElem < array[i]){
                secondBiggestElem = biggestElem;
                biggestElem = array[i];

            } else if (biggestElem > array[i] && secondBiggestElem < array[i]) {
                secondBiggestElem = array[i];
            }
        }

        return secondBiggestElem;
    }

}
