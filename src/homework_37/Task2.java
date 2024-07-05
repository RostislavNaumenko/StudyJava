package homework_37;

/*
* Создайте два множества строк (Set<String>), каждое из которых будет заполнено различными словами. Некоторые слова должны повторяться в обоих множествах.

Реализуйте метод union(Set<String> set1, Set<String> set2), который возвращает множество, содержащее все уникальные элементы из обоих множеств (объединение множеств).

Реализуйте метод intersection(Set<String> set1, Set<String> set2), который возвращает множество, содержащее только элементы, которые присутствуют в обоих исходных множествах (пересечение множеств).

Реализуйте метод difference(Set<String> set1, Set<String> set2), который возвращает множество элементов, которые есть в первом множестве, но отсутствуют во втором (разность множеств).
* */

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Task2 {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>(List.of("A", "B", "C", "D"));
        Set<String> set2 = new HashSet<>(List.of("C", "D", "E", "F"));

        System.out.println(union(set1, set2));
        System.out.println(intersection(set1, set2));
        System.out.println(difference(set1, set2));
    }

    public static Set<String> union(Set<String> set1, Set<String> set2){
        Set<String> result = new HashSet<>(set1);

        result.addAll(set2);

        return result;
    }

    public static Set<String> intersection(Set<String> set1, Set<String> set2){
        Set<String> result = new HashSet<>(set1);

        result.retainAll(set2);

        return result;
    }

    public static Set<String> difference(Set<String> set1, Set<String> set2){
        Set<String> result = new HashSet<>(set1);

        result.removeAll(set2);

        return result;
    }
}
