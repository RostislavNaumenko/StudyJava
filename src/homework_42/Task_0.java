package homework_42;

/*
 * Разбейте строку на слова, используя в качестве разделителя пробел.
 * Используя функцию reduce верните суммарное количество букв в словах, которые длиннее 4 символов
 * */


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task_0 {
    public static void main(String[] args) {
        String text = "Hello, world and good afternoon";
        int countLetters = countLetters(text);
        System.out.println("countLetters: " + countLetters);
    }

    private static int countLetters(String text) {
        String stringOnlyWords = text.replaceAll("[^a-zA-Zа-яА-Я0-9 ]", "");
        List<String> list = new ArrayList<>(List.of(stringOnlyWords.split(" ")));

        int counterLetters = list.stream()
                .filter(str -> str.length() > 4)
                .map(String::length)
                .reduce(0, Integer::sum);
        return counterLetters;
    }
}
