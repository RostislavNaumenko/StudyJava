package homework_18;

import java.util.Date;

public class Doctor extends Human{
    private String specialization;
    private int amountOfPatients;
    private int counterOfRecoveredPatients;

    public Doctor(int years, String name, String lastName, String specialization, int amountOfPatients) {
        super(years, name, lastName);
        this.specialization = specialization;
        this.amountOfPatients = amountOfPatients;
    }

    public void addPatients(){
        System.out.println("Добавлен пациент доктору: " + this.getLastName() + " | Всего пацинетов: " + this.amountOfPatients);
        amountOfPatients++;
    }

    public void recoverdPatients(){
        if(amountOfPatients == 0 || amountOfPatients < 0){
            amountOfPatients = 0;
            System.out.println("Нет пациентов");
        }else {
            counterOfRecoveredPatients++;
            amountOfPatients--;
            System.out.printf("Пациент вылечен! Вылеченых пациентов: %d, пациентов осталось: %d \n", counterOfRecoveredPatients, amountOfPatients);

        }
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getAmountOfPatients() {
        return amountOfPatients;
    }


}
