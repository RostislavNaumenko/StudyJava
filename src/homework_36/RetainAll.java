package homework_36;

import java.util.ArrayList;
import java.util.List;

public class RetainAll {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 10));
        List<Integer> integerList2 = new ArrayList<>(List.of(3, 4, 4, 5, 5, 6, 7, 8));

        List<Integer> list = intersection(integerList, integerList2);
        System.out.println(list);

        List<Integer> list2 = intersection(integerList2, integerList);
        System.out.println(list2);
    }

    public static <T> List<T> intersection(List<T> list1, List<T> list2){
        List<T> result = new ArrayList<>(list1);
        result.retainAll(list2);
        return result;
    }
}
