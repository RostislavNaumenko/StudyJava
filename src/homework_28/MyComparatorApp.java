package homework_28;

import java.util.Arrays;
import java.util.Comparator;

public class MyComparatorApp {
    public static void main(String[] args) {
        Integer[] arr = {1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };

        MyComparator myComparator = new MyComparator();
        Arrays.sort(arr, myComparator);

        System.out.println(Arrays.toString(arr));

        MyComparatorReversed myComparatorReversed = new MyComparatorReversed();
        Arrays.sort(arr, myComparatorReversed);

        System.out.println(Arrays.toString(arr));
    }
}
