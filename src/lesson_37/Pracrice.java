package lesson_37;

import java.sql.Array;
import java.util.*;

public class Pracrice {
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>(List.of(1,1,2,2,3,3,4,5,6,8,7,7));

        System.out.println(uniqElements(integers));
        System.out.println(uniqElementsReversed(integers));

    }


    public static List<Integer> uniqElementsReversed(List<Integer> list){
        Set<Integer> integers =(Set<Integer>) new TreeSet<>(Comparator.reverseOrder());
        integers.addAll(list);

        return  new ArrayList<>(integers);
    }

    public static List<Integer> uniqElements(List<Integer> list){
        Set<Integer> integers = new LinkedHashSet<>(list);

        return  new ArrayList<>(integers);
    }
}
