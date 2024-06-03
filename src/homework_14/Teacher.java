package homework_14;

public class Teacher {
    String name;
    String subject;
    int students;


    public Teacher(String name, String subject, int students){
        this.name = name;
        this.subject = subject;
        this.students = students;
    }

    void teacherInfo(){
        System.out.printf("I am %s, I am teaching %s, I have %d students\n", name, subject, students);
    }

    void addStudents(int students){
        if(this.students > 32 || students > 32 || this.students + students > 32){
            System.out.println("I cannot take more students");
        }else {
            this.students += students;
            System.out.printf("I have %d students\n", this.students);
        }

    }

    void teachingStudents(){
        System.out.printf("I am teaching %d students right now\n", students);
    }
}
