package lesson_24;

import homework_23.MagicList;

public class MethodsApp {
    public static void main(String[] args) {
        Integer[] integers = {1,2,3,4,5,6,7,9,8};
        String[] strings = {"Hello", "Java", "JS", "C++"};

        MagicList<Double> doubleMagicList = new MagicList<>(new Double[]{1.3, 2.4, 3.7});

        System.out.println(Util.listSum(doubleMagicList));
    }



}
