package homework_07;

/**
 * Task 4
 * Используйте цикл while для решения задачи:
 *
 * Распечатайте 10 строк: "Task1", "Task2", ..., "Task10".
 * */


public class Task4 {
    public static void main(String[] args) {
        int amountOfStrings = 10;
        int i = 1;
        while (i <= 10){
            System.out.println("Task" + i);
            i++;
        }
    }
}
