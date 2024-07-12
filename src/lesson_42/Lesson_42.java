package lesson_42;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lesson_42 {
    public static void main(String[] args) {
        //task1();
        //task2();
        task3();
    }

    private static void task3() {
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

        Map<String, Set<Employee>> map1 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.toSet()));

        System.out.println("map1: " + map1);

        DoubleSummaryStatistics statistics = employees.stream()
                .collect(Collectors.summarizingDouble(Employee::getSalary));

        System.out.println(statistics);
    }

    private static void task1() {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 5, -5, 10, 22, 34));

        boolean isAllMatch = list.stream()
                .filter(i -> i > 10)
                .peek(i -> System.out.print(i + ", "))
                .allMatch(i -> i % 2 == 0);

        System.out.println("\n" + isAllMatch);

        IntSummaryStatistics statistics = list.stream()
                .collect(Collectors.summarizingInt(Integer::intValue));

        System.out.println(statistics.getAverage());
    }

    private static void task2() {
        List<String> list = List.of("E1", "E2", "E3");

        Stream<String> stream = list.stream()
                .map(str -> {
                    System.out.println("map " + str);
                    return "_" + str;
                })
                .filter(str -> {
                    System.out.println("filter " + str);
                    return str.length() <= 3;
                });
               stream.forEach(str -> System.out.println("ForEach " + str));

    }
}
