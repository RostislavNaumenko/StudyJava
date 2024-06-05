package lesson_16;


/*
* Task 1
Класс "Калькулятор" Создайте класс Calculator,
который будет предоставлять базовые арифметические операции: сложение, вычитание, умножение и деление.
*
Класс должен содержать: Статические методы для каждой операции, принимающие два аргумента и возвращающие результат операции.
*
* */

public class MathUtils {

    public static int sumOfInts (int a, int b){
        int sum = a + b;

        return sum;
    }

    public static int subtractionOfInts (int a, int b){
        int subtraction = a - b;

        return subtraction;
    }
    public static int multiplicationOfInts (int a, int b){
        int multiplication = a * b;

        return multiplication;
    }

    public  static int divisionOfInts (int a, int b){
        if(b == 0) return Integer.MIN_VALUE;

        int division = a / b;

        return division;
    }
}
