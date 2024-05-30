package homework_06;

/*
    Запишите в 4 переменные случайные числа от 0 до 100.
    Выведите все 4 числа на экран.
    Программа должна определить максимальное из этих четырех чисел и вывести результат на экран.
*/

public class Task2 {
    public static void main(String[] args) {

        int num1 = (int) (Math.random()*100);
        int num2 = (int) (Math.random()*100);
        int num3 = (int) (Math.random()*100);
        int num4 = (int) (Math.random()*100);

        int max = num1;

        System.out.printf("Число №1: %d, Число №2: %d, Число №3: %d, Число №4: %d \n",num1, num2,num3,num4);

        if (num2 > max) max = num2;

        if (num3 > max) max = num3;

        if (num4 > max) max = num4;

        System.out.println("Result: " + max);
    }
}
