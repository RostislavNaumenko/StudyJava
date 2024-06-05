package lesson_15;

import java.util.Arrays;

public class Lesson15 {
    public static void main(String[] args) {
        MagicArray ma = new MagicArray();

        ma.add(10);
        ma.add(77);
        ma.add(50);
        ma.add(12);


        ma.add(5,7,8,1, 2, 3,4,6,15);

        System.out.println(ma.toString());

        System.out.println(ma.size());

        System.out.println(ma.getValue(11));

        System.out.println(ma.toString());

        // Вызов метода удаления элемента из массива по его значению
        System.out.println("Remove by value " + ma.removeByValue(50));

        System.out.println(ma.toString());


        System.out.println(ma.toString());
        System.out.println("==================");
        ma.changeValueByIndex(23,100);

        System.out.println(ma.toString());


        System.out.println("========= changeValueByIndex");
        System.out.println(ma.changeValueByIndex(60, 9));
        System.out.println(ma.toString());
        System.out.println("===========");
        //Массив для передачи в Magic array
        int [] arr;

        // [1 2 34  6]  + [6 8 9 10 12]
        int [] a1 = {1,2,34,6};
        int [] a2 = {6,8, 9, 10 , 12};
        MagicArray ma2 = new MagicArray(a1);
        ma2.add(a2);

        arr = ma2.getArray();

        System.out.println(Arrays.toString(arr));
        System.out.println("=============");
        System.out.println(ma2.lengthByHande());

        System.out.println(ma2.size());

    }
}
