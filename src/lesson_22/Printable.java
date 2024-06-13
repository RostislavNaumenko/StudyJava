package lesson_22;

public interface Printable {
    double PI = 3.14;


    void print();

    default void test(){
        System.out.println("test");
    }

    static void testStatic(String str){
        System.out.println("Static test " + str);
    }

    private String getSomeString (){
        return "Some str";
    }
}
