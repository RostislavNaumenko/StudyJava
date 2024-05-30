package homework_10;

import java.util.Arrays;

/**
 * Task 2
 * Написать метод, принимающий на вход массив строк.
 * Метод должен вернуть массив, состоящий из самой короткой и самой длинной строки изначального массива.
 */
public class Task2 {
    public static void main(String[] args) {
        String[] array = {"Python", "C++", "JavaScript", "Java", "C#"};

        System.out.println(Arrays.toString(finderLongestAndShortestWord(array)));

    }

    public static String[] finderLongestAndShortestWord(String[] arr) {

        String[] longestAndShortestWord;

        if (arr == null || arr.length == 0) return new String[]{" "};
        String min = arr[0];
        String max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (min.length() > arr[i].length()) {
                min = arr[i];

            }
            if (max.length() < arr[i].length()) {
                max = arr[i];

            }
        }
        longestAndShortestWord = new String[]{min, max};

        return longestAndShortestWord;
    }
}
