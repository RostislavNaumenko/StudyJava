package lesson_11;

public class Test {
    public static void main(String[] args) {
        int[] array = {1, 6, 7, 2, 3, 5, 0, 10, 12, -10};

        ArraysUtil.sortArray(array);
        ArraysUtil.printArray(array);
        //System.out.println(ArraysUtil.linearSearch(array, 10));
        System.out.println(ArraysUtil.binarySearch(array, 0));

    }
}
