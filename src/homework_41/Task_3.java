package homework_41;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
* Имеется список целых чисел.

Необходимо отфильтровать этот список,
* оставив только чётные числа, затем каждое число умножить на 2,
* и собрать результат в новый список
* */
public class Task_3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,0,-20, 40, 23, 78, 59, 122, 13));

        List<Integer> result = list.stream()
                .filter(integer -> integer % 2 == 0)
                .filter(integer -> integer != 0)
                .map(integer -> integer * 2)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
