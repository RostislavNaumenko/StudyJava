package homework_14;

public class Student {
    String name;
    int age;
    String group;

    public Student(){

    }

    public Student(String name){
        this.name = name;
    }

    public Student(String name, int age){
        this(name);
        this.age = age;
    }

    public Student(String name, int age, String group){
        this(name, age);
        this.group = group;
    }

    void studying(){
        System.out.println("I am studying");
    }

    void goingHome(){
        System.out.println("I am going home");
    }

    void doingHomework() {
        System.out.println("I am doing my homework");
    }

    void studenInfo (){
        System.out.printf("I am %s, I am %d years old, I am in group %s\n", name,age,group);
    }

}



