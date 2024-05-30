package homework_05;

import java.util.Scanner;

public class HomeWork_05 {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1" + "\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String name = input.nextLine();
        System.out.println("Количество символов в сторке: " + name.length());
        char firstLetter = (name.charAt(0));
        char lastLetter = name.charAt(name.length() - 1);

        System.out.println("Первая буква имени в десятичной системе: " + (int) firstLetter);
        System.out.println("Последняя буква имени в десятичной системе: " + (int) lastLetter);

        System.out.println("\n" + "====================================" + "\n");

        //Task 2
        System.out.println("Task 2" + "\n");
        String str1 = "Java";
        String str2 = "is";
        String str3 = "a";
        String str4 = "powerful";
        String str5 = "language";
        String space = " ";
        String result = String.join(space, str1, str2, str3, str4, str5);
        System.out.println(result);
        System.out.println(str1 + " " + str2 + " " + str3 + " " + str4 + " " + str5);
        System.out.println("\n");

        //Task 2.2

        boolean bool = 0 < (result.indexOf("age"));
        System.out.println("Находится ли  подстрока 'age' в строке: " + result.indexOf("age"));
        System.out.println("\n" + "================================" + "\n");

        //Task4
        System.out.println("Task 4" + "\n");
        System.out.println("Введите число: ");
        int number = input.nextInt();
        input.nextLine();
        boolean examination1 = (number % 2) == 0;
        boolean examination2 = (number % 3) == 0;
        boolean examination3 = (examination1) & (examination2);
        System.out.println("Число: " + number + ", " + "четное: " + examination1 + ", " + "кратно 3: " + examination2 + ", " + "четное и кратно 3: " + examination3);
        System.out.println("\n" + "====================================" + "\n");

        //Task 3
        System.out.println("Task 3" + "\n");
        System.out.println("Введите строку четной длины: ");
        String word = input.nextLine();
        String subString = word.substring((word.length() / 2 - 1), (word.length() / 2) + 1);
        System.out.println("Два средних символа в вашей строке: " + subString);
    }


}
