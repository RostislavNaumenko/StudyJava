package homework_41;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/*
 * Имеется список строк. Используя Stream API, найдите строку с максимальной длиной.
 * */
public class Task_2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Java", "JS", "C++", "C#", "Python", "PHP"));

        String result = list.stream()
                .max((str1, str2) -> str1.length() - str2.length())
                .orElse(null);

        System.out.println(result);
    }
}
