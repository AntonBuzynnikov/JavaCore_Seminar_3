package org.java.core;

import java.util.*;

public class Student {
    private String name;
    private List<Double> grades;
    private String speciality;

    public Student(String name, List<Double> grades, String speciality) {
        this.name = name;
        this.grades = grades;
        this.speciality = speciality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "name: " + getName() + ", grades: " + getGrades() + ", speciality: " + getSpeciality();
    }

    public static List<Student> getAverageGrade(List<Student> students){
        return students.stream().filter(x-> x.getSpeciality().equalsIgnoreCase("ИНФОРМАТИКА")
                        && x.getGrades().stream().mapToDouble(e -> e).average().orElse(0) >= 4.5)
                            .limit(5).toList();
    }
}
