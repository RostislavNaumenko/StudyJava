package homework_13;

/*
Task 3
Подсчет гласных и согласных
Напишите программу, которая просит пользователя ввести слово и подсчитывает количество гласных и согласных букв в этом слове.
 */

import java.util.Arrays;
import java.util.Scanner;


public class Homework13_Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите слово: ");
        String str = scanner.nextLine();

        char[] chars = str.toCharArray();

        // vowels = {'a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y'};

        int vowelsCounter = 0;

        int consonantsCounter = 0;

        char[] vowels = {65, 69, 73, 79, 85, 89};
        char[] consonants = new char[20];

        int fillArrayCounter = 0;
        for (int i = 66; i <= 90; i++) {
            boolean isVowel = false;

            for (int j = 0; j < vowels.length; j++) {
                if (i == vowels[j]) {
                    isVowel = true;
                    break;
                }
            }
            if (!isVowel) {
                consonants[fillArrayCounter] = (char) i;
                fillArrayCounter++;
            }

        }


        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < consonants.length; j++) {
                if(j < vowels.length && (chars[i] == (int) vowels[j] || chars[i] == vowels[j] + 32 )){
                    vowelsCounter++;

                }
                if (chars[i] == (int) consonants[j] || chars[i] == consonants[j] + 32 ){
                    consonantsCounter++;

                }
            }
        }

        System.out.println("Гласных: " + vowelsCounter);
        System.out.println("Согласных: " + consonantsCounter);


    }
}
