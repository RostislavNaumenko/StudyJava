package homework_06;

import java.util.Objects;
import java.util.Scanner;

/*
Необходимо написать программу, которая предлагает пользователю ввести число на выбор: 1, 2 или 3.

Программа должна сказать, какое число ввёл пользователь: Один, Два, или Три (текстом)
*/
public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число от 1 до 3: ");
        String num = scanner.nextLine();


        if ((!Objects.equals(num, "1")) & (!Objects.equals(num, "2")) & (!Objects.equals(num, "3"))) {

            System.out.println("Число больше 3");

        } else {

            if (Objects.equals(num, "1")) {

                System.out.println("Один");

            } else if (Objects.equals(num, "2")) {

                System.out.println("Два");

            } else {

                System.out.println("Три");

            }

        }

    }
}

