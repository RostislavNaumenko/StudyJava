package lesson_13;

import java.util.Arrays;

public class Lesson_13 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String test = "Hello Java Test";
        String[] str = test.split(" ");
        String res;

        for (int i = 0; i < str.length; i++){
            stringBuilder.append(str[i].charAt(0));

        }
        System.out.println(stringBuilder);
    }
}
