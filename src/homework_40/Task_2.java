package homework_40;

import java.util.function.Function;

/*
* Создайте цепочку функций, которая сначала удаляет пробелы из строки,
* затем преобразует её в верхний регистр, и в конце считает количество символов в измененной строке
* */
public class Task_2 {
    public static void main(String[] args) {
        String string = "Hello, Java world!";


        Function<String, String> function = str -> str.replaceAll("\\s+", "");
        Function<String, String> function1 = String::toUpperCase;
        Function<String, Integer> function2 = String::length;
        Function<String, Integer> combineFunction = function.andThen(function1.andThen(function2));

        System.out.println(combineFunction.apply(string));
    }
}
