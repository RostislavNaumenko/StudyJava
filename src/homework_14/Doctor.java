package homework_14;

public class Doctor {
    String lastName;
    String department;
    int amountOfPatients;

    public Doctor (String lastName, String department, int amountOfPatients){
        this.lastName = lastName;
        this.department = department;
        this.amountOfPatients = amountOfPatients;
    }

    void checkingPatients(){
        System.out.println("I am checking my patients");
    }

    void  setAmountOfPatients (int amountOfPatients){
        this.amountOfPatients = amountOfPatients;
        System.out.printf("I have %d patients\n", amountOfPatients);
    }

    void showPatients () {
        System.out.printf("I have %d patients\n", amountOfPatients);
    }

    void setDepartment (String department) {
        this.department = department;
        System.out.println("I am going to new department: " + department);
        //При смене отдела количество пациентов обнуляется
        setAmountOfPatients(0);
    }

    void doctorInfo(){
        System.out.printf("I am %s, I am working in %s department, I have %d patients\n", lastName, department, amountOfPatients);
    }
}
