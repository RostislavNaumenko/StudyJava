package homework_41;

/*
* Из списка целых чисел выделите те значения, которые больше 10;
*  отсортируйте эти значения по значению последней цифры в числе и выведите результат на экране
* */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task_1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(12, 2, 25, 58, 7, 0, 88, 90, 4, 43, 102, 139));

        List<Integer> result = list.stream()
                .filter(integer -> integer > 10)
                .sorted((a, b) -> Integer.compare(a % 10, b % 10))
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
