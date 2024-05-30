package lesson_06;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        int childrenMoney = 100;
        int achiev5 = 20;
        int achiev4 = 10;
        int achiev3 = 0;
        int achiev2 = -10;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите оценку: ");
        int achiev = scanner.nextInt();

        if ((achiev > 5) | (achiev < 0)) {
            System.out.println("Неправильное число");
            return;
        }

        if (achiev == 5) {
            childrenMoney += achiev5;
        } else if (achiev == 4) {
            childrenMoney += achiev4;
        } else if (achiev == 3) {
            childrenMoney += achiev3;
        } else if (achiev == 2) {
            childrenMoney += achiev2;
        } else {
            childrenMoney = 0;
        }

        System.out.println("Денег у ученика: " + childrenMoney);

    }
}
