package homework_14;

public class DoctorTest {
    public static void main(String[] args) {

        Doctor doctor = new Doctor("Sapronov", "Surgery",20);

        doctor.doctorInfo();

        doctor.setAmountOfPatients(10);

        doctor.setDepartment("Traumatology");

        doctor.doctorInfo();
    }
}
