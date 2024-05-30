package homework_07;

import java.util.Scanner;

/**
 * Напишите программу, которая просит пользователя ввести слово "hello".
 * Если пользователь вводит правильное слово, программа благодарит его и завершает работу.
 * Если вводится неправильное слово, программа продолжает запрашивать ввод, пока не будет введено правильное слово.
 *
 * Дополнительно: Подсчитайте количество попыток, потребовавшихся для ввода правильного слова, и выведите это количество на экран.
 * */

public class Task6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите слово 'hello': ");
        String str = scanner.nextLine();

        int counter = 1;
        String rightWord = "hello";


        while (!rightWord.equals(str)){
            System.out.print("Введите слово 'hello': ");
            str = scanner.nextLine();
            counter++;
        }

        System.out.println("Количество попыток: " + counter);


//        do{
//            System.out.print("Введите слово 'hello': ");
//            str = scanner.nextLine();
//            Отcчет нужно начать с 0, а не с 1
//            counter++;
//        }while (!rightWord.equals(str));
//
//        System.out.println("Количество попыток: " + counter);
    }
}
