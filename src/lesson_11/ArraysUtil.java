package lesson_11;

public class ArraysUtil {
    public static void main(String[] args) {

    }

    public static int binarySearch(int[] array, int value) {

        int startIndex = 0;
        int endIndex = array.length - 1;

        int midleIndex;

        while (startIndex <= endIndex) {

            midleIndex = (endIndex - startIndex) / 2;

            if (array[midleIndex] == value) {
                return midleIndex;
            }

            if (array[midleIndex] > value) {
                endIndex = midleIndex - 1;

            } else {
                startIndex = midleIndex + 1;
            }

        }
        return -1;
    }

    public static int linearSearch(int[] array, int value) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static void sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {

            int minIndex = minIndexSearch(array, i);

            int temp = array[i];

            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

    public static int minIndexSearch(int[] array, int startIndex) {
        int min = array[startIndex];
        int minIndex = startIndex;

        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }

        return minIndex;
    }

    public static void printArray(int[] array) {

        if (array == null) {
            System.out.println("null");
            return;
        }


        System.out.print("[");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ((i < array.length - 1) ? ", " : "]\n"));
        }

        if (array.length == 0) {
            System.out.println("]");
        }

    }
}
