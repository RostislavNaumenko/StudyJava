package lesson_05;

import java.util.Arrays;

public class Lesson_05 {
    public static void main(String[] args) {
        String greeting = "Hello, world!";

        // toLowerCase
        String lowerCase = greeting.toLowerCase();
        System.out.println("lowerCase: " + lowerCase);
        System.out.println("greeting: " + greeting);


        //toUpperCase
        System.out.println(greeting.toUpperCase());

        // Различные варианты склеивания / объединения / конкатенации строк
        String str1 = "One";
        String str2 = " ";
        String str3 = "hello";

        String concatStr = str1 + str2 + str3;
        System.out.println("concatStr: " + concatStr);




        String letters = "abcdefgh";
        // Взять из строки символ по его индексу (номеру). charAt()
        char firstChar = letters.charAt(0);
        System.out.println("firstChar: " + firstChar);

        char lastChar = letters.charAt(letters.length() - 1);
        System.out.println("lastChar: " + lastChar);


        //indexOf - ищет индекс начала первого вхождения подстроки в строке

        String digits = "012345678-01-678";
        int index = digits.indexOf('4'); // char - ''
        System.out.println("index: " + index);

        index = digits.indexOf("67");
        System.out.println("index 67: " + index);


        // индекс последнего вхождения

        index = digits.lastIndexOf("67");
        System.out.println("last index 67: " + index);

        //Замены

        String target = "abcabeabd";
        //Замена подстроки на другую
        String output = target.replace("ab", "AB");
        System.out.println("output: " + output);

        output = target.replaceFirst("ab", "AB");
        System.out.println("first output: " + output);

        output = target.replaceAll("ab", "AB");
        System.out.println("all output: " + output);


        System.out.println("\n =========================== \n");
        // Выделение подстроки

        digits = "0123456789";

        String subString = digits.substring(2);
        System.out.println("digits: " + digits);

        subString = digits.substring(2, 5); // [2, 5) // 2,3,4 => с индекса 2  включительно до индекса 5 НЕ включительно

        System.out.println("subString: " + subString);

        System.out.println(digits.substring(0, 3+1)); // получить первые четыре символа

    }
}
