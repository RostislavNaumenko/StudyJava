package lesson_22;

public class Presentation implements ColorPrintable{
    String title;
    String author;
    String theme;
    int amountPages;

    public Presentation(String title, String author, String theme, int amountPages) {
        this.title = title;
        this.author = author;
        this.theme = theme;
        this.amountPages = amountPages;
    }

    @Override
    public void print() {
        System.out.println("Presentation " + title + " (pages" + amountPages + ")");
    }

    @Override
    public void ColorPrint() {
        System.out.println("Отправляю презентацию");
        System.out.println("Presentation in color by: " + author + "; title: " + title );
    }

    @Override
    public void test() {
        System.out.println("Print with red (test)");
    }
}
