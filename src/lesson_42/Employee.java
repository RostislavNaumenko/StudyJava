package lesson_42;

import java.util.Objects;

public class Employee {
    private String name;
    private String department;
    private String position;
    private int age;
    private int salary;

    public Employee(String name, int age, int salary, String department, String position) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
        this.position = position;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && salary == employee.salary && Objects.equals(name, employee.name) && Objects.equals(department, employee.department) && Objects.equals(position, employee.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, department, position, age, salary);
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "{" +
                name +
                " : " + salary +
                " : " + position +
                '}';
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
