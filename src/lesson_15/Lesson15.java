package lesson_15;

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

        System.out.println("Remove");


        System.out.println(ma.removeByValue(10));

        System.out.println(ma.toString());

        ma.changeValueByIndex(23,100);

        System.out.println(ma.toString());

        ma.printArray();

        int [] arr = {1,2,3,4,5,6};

        MagicArray ma1 = new MagicArray(arr);

        System.out.println(ma1.toString());
    }
}
