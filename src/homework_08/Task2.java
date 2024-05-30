package homework_08;

import java.util.Scanner;

/**
 * Программа запрашивает у пользователя ввод произвольного числа.
 * Вывести сумму цифр этого числа.
 *
 * Пример:
 * 567432 -> 5+6+7+4+3+2 -> 27
 * */
public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");

        int num = scanner.nextInt();
        scanner.nextLine();

        int counter = 0;

        while (num > 0) {
            counter += num % 10;
           num /=  10;
        }

        System.out.println("Сумма цифр вашего числа: " + counter);


    }
}
