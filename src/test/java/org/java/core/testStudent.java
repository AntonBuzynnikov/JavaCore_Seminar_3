package org.java.core;


import java.util.ArrayList;
import java.util.List;

public class testStudent {
    public static void main(String[] args) {
        List<Student> students =
                new ArrayList<>(List.of(new Student("Иванов Иван",List.of(4.0,5.0,5.0,4.0), "Информатика"),
                                        new Student("Петров Петр", List.of(5.0,5.0,5.0,4.0), "Информатика"),
                                        new Student("Сидоров Сергей", List.of(5.0,4.0,5.0,5.0), "Гуманитарные науки"),
                                        new Student("Смирнов Михаил", List.of(4.0,5.0,5.0,4.0), "Информатика"),
                                        new Student("Козлов Андрей", List.of(5.0,5.0,5.0,5.0), "Информатика"),
                                        new Student("Никитин Александр", List.of(5.0,5.0,4.0,4.0), "Информатика"),
                                        new Student("Кузнецов Владимир", List.of(5.0,5.0,5.0,4.0), "Информатика")));
        students.forEach(System.out::println);
        System.out.println();
        Student.getAverageGrade(students).forEach(System.out::println);

    }

}
