package homework_09;

/**
 * Task 2
 * Написать метод, принимающий на вход целое число. Метод должен вывести на экран 2 в степени этоЧисло
 *
 * класс Math для нахождения степени числа использовать нельзя ;)
 * */

public class Task2 {
    public static void main(String[] args) {
        powOfTwo(0);
    }
    public static void powOfTwo (int num){
        int pow = 1;
        for (int i = 0; i < num; i++){
            pow *= 2;
        }
        System.out.printf("2 в степени %d = %d",num ,pow);

        
    }
}
