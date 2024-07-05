package homework_37;

//Напишите метод, принимающий строку и возвращающий Список ее слов без повторений, отсортированный в порядке увеличения длин слов.

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        System.out.println(getUniqueSortedWords(testString));

    }

    public static List<String> getUniqueSortedWords(String str){
        Set<String> setString =  new TreeSet<>((o1, o2) -> o1.length() - o2.length());
        List<String> list = new ArrayList<>(List.of(str.split("[\\P{L}]+")));
        setString.addAll(list);
        List<String> resulList = new ArrayList<>(setString);


        return resulList;
    }
}
