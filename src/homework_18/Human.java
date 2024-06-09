package homework_18;

import java.util.Date;

public class Human {
    private String name;
    private String lastName;
    private int years;


    public Human(int years, String name, String lastName) {
        this.years = years;
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", years= " + years +
                '}';
    }

    public void birthday(){
        years++;
        System.out.printf("С днем рождения! Вам исполнилось: %d \n", years);


    }

    public String getName() {
        return name;
    }

    public int getYears() {
        return years;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
