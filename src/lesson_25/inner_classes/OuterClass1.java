package lesson_25.inner_classes;

public class OuterClass1 {
    private  static int staticOuterField = 42;
    private int instanceOuterField = 25;

    class InnerClass {
        void display() {
            System.out.println("Inside inner class");
            System.out.println("StaticOuterField: " + staticOuterField);
            System.out.println("InstanceOuterField: " + instanceOuterField);
        }
    }
}
