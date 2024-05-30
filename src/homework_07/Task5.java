package homework_07;

/**
 * Используйте цикл while для решения задачи:
 * Распечатайте 7 чисел от 1 до 100, которые делятся на 5 без остатка.
 * */
public class Task5 {
    public static void main(String[] args) {
        int amountOfNum = 7;
        int i = 1;
        int divisor = 5;
        while (i <= 100 && amountOfNum > 0) {
            if (i % 5 == 0){
                amountOfNum--;
                System.out.print(i + "; ");
            }
            i++;
        }
    }
}
