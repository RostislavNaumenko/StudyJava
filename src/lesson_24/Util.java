package lesson_24;

import homework_23.MagicList;

public class Util {

    //Меняем 2 элемента местами
    public static <T> void swap (T[] array, int i, int j){
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }

    public static <T extends Number> int sum(T...elements) {
        int sum = 0;
        for (int i = 0; i < elements.length; i++) {
            sum += elements[i].intValue();
        }
        return sum;
    }

    public static double listSum(MagicList<? extends Number> listNumber){
        double sum = 0;
        for (int i = 0; i < listNumber.size(); i++) {
            sum += listNumber.get(i).doubleValue();
        }

        return sum;
    }

    public static void addNumbers (MagicList <? super Integer> myList){
        for (int i = 0; i < 5; i++) {
            myList.add(i);
        }
    }
}
