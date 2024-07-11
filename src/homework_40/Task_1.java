package homework_40;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/*
* Напишите метод, принимающий список чисел и возвращающий новый, отфильтрованный список.
* Используйте несколько предикатов для фильтрации списка чисел, где числа должны быть четными, больше 10 и меньше 100
* */
public class Task_1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(2, 5, 6, 11, 12, 102, 55, 61, 50, 24);

        Predicate<Integer> predicate = integer -> integer % 2 == 0;
        Predicate<Integer> predicate1 = integer -> integer > 10;
        Predicate<Integer> predicate2 = integer -> integer < 100;
        Predicate<Integer> combinePredicate = predicate.and(predicate1.and(predicate2));

        System.out.println(filterByPredicate(list, combinePredicate));

    }

    public static List<Integer> filterByPredicate(List<Integer> integers, Predicate<Integer> predicate){
        List<Integer> result = new ArrayList<>();

        for (Integer integer: integers){
            if(predicate.test(integer)){
                result.add(integer);
            }
        }

        return result;
    }
}
