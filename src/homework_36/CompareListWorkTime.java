package homework_36;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class CompareListWorkTime {
    private static final int CAPACITY = 5_000;
    private static final int BOUND = 1000;


    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        Random random = new Random();

        for (int i = 0; i < CAPACITY; i++) {
            int value = random.nextInt(BOUND);
            arrayList.add(value);
            linkedList.add(value);
        }

        System.out.println("getElements :" + getElements(arrayList));
        System.out.println("getElements Linked:" + getElements(linkedList));

        System.out.println("==========================");

        System.out.println("insertElements: " + insertElements(arrayList));
        System.out.println("insertElements Linked: " + insertElements(linkedList));

        System.out.println("==========================");

        System.out.println("deleteElementsBYIndex: " + deleteElementsBYIndex(arrayList));
        System.out.println("deleteElementsBYIndex Linked : " + deleteElementsBYIndex(linkedList));

        System.out.println("==========================");
        System.out.println("deleteElementsByValue: " + deleteElementsByValue(arrayList));
        System.out.println("deleteElementsByValue Linked: " + deleteElementsByValue(arrayList));


    }

    public static long getElements(List<Integer> integers) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < integers.size(); i++) {
            int value = integers.get(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static long insertElements(List<Integer> list) {
        long start = System.currentTimeMillis();

        Random random = new Random();
        for (int i = 0; i < 2000; i++) {
            list.add(random.nextInt(list.size()), random.nextInt(BOUND));
        }

        long end = System.currentTimeMillis();
        return end - start;
    }

    public static long deleteElementsBYIndex(List<Integer> list) {
        Random random = new Random();
        long start = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            list.remove(random.nextInt(list.size()));
        }

        long end = System.currentTimeMillis();
        return end - start;

    }
    public static long deleteElementsByValue(List<Integer> list){
        Random random = new Random();
        long start = System.currentTimeMillis();

        for (int i = 0; i < list.size(); i++) {
            list.remove(Integer.valueOf(random.nextInt(BOUND)));
        }


        long end = System.currentTimeMillis();
        return end - start;
    }



}
