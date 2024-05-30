package lesson_04;

class HW {
    public static int variable = 10;

    void add(int num) {
        variable += num;
    }
    void add(int num, String name) {
        variable += num;

    }

    void print() {
        System.out.println(variable);
    }
}

public class Lesson_04 {
    public static void main(String[] args) {
        HW obj1 = new HW();

        obj1.add(14);

        HW obj2 = new HW();

        obj2.print();


        double x = 20.0;
        double y = 7.0;

        double result = x / y;

        System.out.println("Result: " + result);

        int age = 25;
        String name = "Alice";
        //Name: Alice, Age: 25
        System.out.printf("Name: %s, Age: %d\n\n\n\n", name, age); // \n - вставляет в текст символ перевода строки.
        System.out.printf("Name: %s, Age: %d\n", name, age);

        System.out.println("Hello"); // println - после вывода строки переводит курсор на новую строку
        /*
        %d - целое число (int)
        %f - число с плавающей точкой
        %s - текст (строка)
        %n - символ новой строки
        */

        System.out.printf("Result rounded %f\n", result); // генерация строки по сокращению souf
        // я могу указать в каком формате (сколько знаков после запятой) вывести число с плавающей точкой

        // result = 4.5;

        System.out.printf("Result rounded %.2f\n", result); // генерация строки по сокращению souf
        System.out.printf("Result rounded %.3f\n", result); // генерация строки по сокращению souf

    }
}
