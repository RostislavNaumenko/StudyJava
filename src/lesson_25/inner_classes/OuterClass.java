package lesson_25.inner_classes;

public class OuterClass {
    private  static int staticOuterField = 42;
    private int instanceOuterField = 25;

    static class StaticNestedClass{
        void display(){
            System.out.println("Inside static nested class");
            System.out.println("StaticOuterField: " + staticOuterField);
        }
    }
}
