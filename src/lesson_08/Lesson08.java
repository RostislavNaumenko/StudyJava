package lesson_08;

import java.util.Arrays;
import java.util.Random;

public class Lesson08 {
    public static void main(String[] args) {
        int[] array;
        String[] strings;


        array = new int[4];
        strings = new String[6];

        int[] array2 = new int[8];


        int[] numbers = new int[]{45, 56, -16, 0, 159, 1444};
        int[] ints = {10, -54, 32224, 555}; // явная инициализация

        int value = numbers[0]; // взять значение 0

        int j = 0;
        while (j < numbers.length) {
            System.out.print(numbers[j] + ", ");
            j++;
        }
        System.out.println();


        String str = "Hello";
        int i1 = 0;
        while (i1 < str.length()) {
            System.out.print(str.charAt(i1++) + ", ");
        }
        System.out.println();

        char[] chars = str.toCharArray(); // получаю массив символов, из которых состояла строка
        System.out.println("длина массива chars: " + chars.length);

        int e = 0;
        System.out.print("[");
        while (e < chars.length) {
            System.out.print(chars[e] + ((e != chars.length - 1) ? ", " : "]"));
            e++;
        }
        System.out.println();

        int[] arr = {3, 5, 7, 9, 11, 15};

        String[] words = {"String", "Java", "Hello", "Python"};
        System.out.println("words.length: " + words.length);
        System.out.println("words[1] -> " + words[1]);
        String python = words[3];
        System.out.println(python);


        // Присвоение новых значений элементам массива
        words[3] = "JS";

        int i = 0;
        while (i < words.length) {
            System.out.print(words[i++] + " ");
        }
        System.out.println();

        //Создать массив из 10 целых чисел и заполнить его случайным значениями от 0..100;
        Random random = new Random();

        int[] nums = new int[10];

        i = 0;
        System.out.print("[");
        while (i < nums.length) {
            nums[i] = random.nextInt(101);
            System.out.print(nums[i] + ((i != nums.length -1) ? ", " : "]"));
            i++;
        }
        System.out.println();

        // Найти минимальное значение в массиве

        int c = 0;
        int min = nums[0];

        while (c < nums.length) {
            if (nums[c] < min) {
                min = nums[c];
            }
            c++;
        }

        System.out.println("min значение в массиве: " + min);
    }

}
