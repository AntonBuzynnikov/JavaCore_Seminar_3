package org.java.core;

import java.util.List;

public class Manager extends Employee{
    public Manager(String name, String position, String phone, double salary, int age) {
        super(name, position, phone, salary, age);
    }
    public static void increaseSalary(List<Employee> employees, int amount,int age){
        List<Employee> temp =
                employees.stream().filter(e-> e.getAge()>age).toList();
        for (Employee item:temp){
            if(!(item instanceof Manager)){
                item.setSalary(item.getSalary() + amount);
            }
        }
    }
}
