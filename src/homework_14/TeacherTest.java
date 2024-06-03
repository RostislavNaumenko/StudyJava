package homework_14;

public class TeacherTest {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Daria", "English",25);

        teacher.teacherInfo();

        teacher.addStudents(5);

        teacher.teachingStudents();
    }
}
