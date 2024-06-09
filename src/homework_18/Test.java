package homework_18;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Test {
    public static void main(String[] args) {
        Doctor doctor = new Doctor(43, "Viktor", "Sapronov", "Surgery", 2);

        System.out.println(doctor.toString());

        doctor.recoverdPatients();
        doctor.recoverdPatients();
        doctor.birthday();

        Student student = new Student(14, "Egor", "Naumenko", 9, 5);

        student.addHomework();
        student.addHomework();
        student.addHomework();


        student.homeworkDone();
        student.homeworkDone();

    }
}
