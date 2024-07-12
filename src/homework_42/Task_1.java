package homework_42;

/*
 * Дан список сотрудников (Employee) с полями name, department, salary.
 *  Используя Stream API, сгруппируйте сотрудников по отделам
 *
 *
 *Task 3
 * Дан список Employee.
 * Вычислите среднюю зарплату сотрудников в каждом отделе и найдите отдел с максимальной средней зарплатой.
 * */


import java.util.*;
import java.util.stream.Collectors;

public class Task_1 {
    public static void main(String[] args) {
        task1();
    }

    private static void task1() {

        List<Employee> employees = new ArrayList<>(List.of(
                new Employee("Peter", 30, 4500, "IT", "Developer"),
                new Employee("Olga", 26, 2200, "IT", "trainee"),
                new Employee("Stefan", 34, 2700, "IT", "PM"),
                new Employee("Mark", 38, 3300, "IT", "chef"),
                new Employee("Hanna", 32, 3500, "Management", "manager"),
                new Employee("Seoin", 30, 1800, "Cleaning", "Cleaner"),
                new Employee("Vlad", 33, 3800, "Management", "chef")
        ));

        Map<String, List<Employee>> map = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));


        System.out.println(map);

        //Task 3
        Map<String, Double> statistics = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                Collectors.averagingDouble(Employee::getSalary)));


        System.out.println(statistics);

        Optional<Map.Entry<String, Double>> biggerAverage = statistics.entrySet()
                .stream().max(Map.Entry.comparingByValue());
        System.out.println("biggerAverage" + biggerAverage);
    }
}
