package org.java.core;


import java.time.LocalDate;
import java.util.List;


public class Employee {
    private String name;
    private String position;
    private String phone;
    private double salary;
    private int age;

    public Employee(String name, String position, String phone, double salary, int age) {
        this.name = name;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void info(){
        System.out.println("Employee name: " + getName() +
                            ", position: " + getPosition() +
                            ", phone: " + getPhone() +
                            ", salary: " + getSalary() +
                            ", age: " + getAge());
    }

    @Override
    public String toString() {
        return "Employee name: " + getName() +
                ", position: " + getPosition() +
                ", phone: " + getPhone() +
                ", salary: " + getSalary() +
                ", age: " + getAge();
    }

    public static void increaseSalary(List<Employee> employees,int amount,int age){
        List<Employee> temp =
                employees.stream().filter(e-> e.getAge()>age).peek(x->x.setSalary(x.getSalary()+amount)).toList();
    }
    public static void compare(int yearFirst, int monthFirst, int dayFirst, int yearSecond, int monthSecond, int daySecond){
        LocalDate first = LocalDate.of(yearFirst, monthFirst,dayFirst);
        LocalDate second = LocalDate.of(yearSecond, monthSecond,daySecond);
        System.out.println(Math.signum(first.toEpochDay()-second.toEpochDay()));
    }
}
