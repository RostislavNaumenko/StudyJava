package homework_07;

import java.util.Scanner;

/**
 * Перепишите решение задачи с использованием switch вместо if-else:
 * Напишите программу, которая предлагает пользователю ввести число 1, 2 или 3.
 * Программа должна выводить на экран введенное число прописью: "Один", "Два" или "Три".
 */
public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число 1, 2 или 3 :");
        int num = scanner.nextInt();

        switch (num){
            case 1:
                System.out.println("Один");
                break;
            case 2:
                System.out.println("Два");
                break;
            case 3:
                System.out.println("Три");
                break;
            default:
                System.out.println("Введенно неправльное число");
        }

    }
}
