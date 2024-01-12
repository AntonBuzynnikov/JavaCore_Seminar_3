package org.java.core;

import java.util.ArrayList;
import java.util.List;

public class testEmployee {
    public static void main(String[] args) {
        List<Employee> employees =
                new ArrayList<>(List.of(new Employee[]{new Employee("Oleg", "developer", "79999999999", 100000.5,25),
                                        new Employee("Stas", "tester", "79999999998", 110000.5, 28),
                                        new Employee("Sergei","analytic","79999999997",120000.5,35),
                                        new Employee("Ivan","designer","79999999996",130000.5,47),
                                        new Employee("Stepan","devOps","79999999995",140000.5,46),
                                        new Manager("Maks", "teamLead", "79999999994",150000.5,46)}));

        System.out.println("Результат теста первого " +
                "задания (-1 - первая дата раньше " +
                "второй, 0 - представлена одна и та же " +
                "дата, 1 - первая дата позже второй)");
        Employee.compare(2022,12,20,2023,12,20);
        System.out.println();
        Employee.compare(2023,12,20,2022,12,20);
        System.out.println();
        Employee.compare(2022,12,20,2022,12,20);

        System.out.println("Результат теста второго задания");
        employees.forEach(System.out::println);
        System.out.println();
        Manager.increaseSalary(employees,5000,20);
        System.out.println();
        employees.forEach(System.out::println);
    }
}
