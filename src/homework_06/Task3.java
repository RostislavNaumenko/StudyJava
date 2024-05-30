package homework_06;

import java.util.Scanner;

/**
Программа предлагает пользователю ввести четырехзначное число.
Ввод осуществляется только в формате строки (String).
Если введенное значение не является четырехзначным числом, должно выводиться сообщение об ошибке, и программа завершает работу.
Проверить, является ли число "счастливым билетом". Для этого нужно сравнить сумму первых двух цифр с суммой последних двух цифр.
*/

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        String enterValue = scanner.nextLine();

        try {
            Integer num = Integer.valueOf(enterValue);
            if(enterValue.length() != 4){
                System.out.println("Неверное число");
            }else {
                int firstNumbers = num / 1000;
                int secondNumbers = num / 100 %10 ;
                int thirdNumbers = num  / 10 %10 ;
                int lastNumbers = num % 10;

                if (firstNumbers + secondNumbers == thirdNumbers+lastNumbers) {
                    System.out.println("Число счастливое");
                }else {
                    System.out.println("Число не счастливое");
                }


            }
        }catch (NumberFormatException e) {
            System.err.println("Неправильный формат строки!");
        }




    }
}
