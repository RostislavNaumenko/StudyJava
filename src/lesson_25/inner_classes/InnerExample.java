package lesson_25.inner_classes;

public class InnerExample {
    public static void main(String[] args) {

        OuterClass.StaticNestedClass nestedClass = new OuterClass.StaticNestedClass();

        nestedClass.display();

        OuterClass1 outerObj = new OuterClass1();

        OuterClass1.InnerClass innerClass = outerObj.new InnerClass();

        innerClass.display();

        OuterClass2  outerClass2 = new OuterClass2();

        outerClass2.myMethod();
    }
}
