package lesson_22;

public class PrintApp {
    public static void main(String[] args) {
        Printable book = new Book("C++", "Stanislav Shurko");

        book.print();

        Printable.testStatic("hello");

        ColorPrintable presentation = new Presentation("C++", "Stas", "Programing", 210);

        presentation.ColorPrint();

        presentation.test();
    }
}
