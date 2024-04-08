package com.dev.DSA;

import java.util.Arrays;
import java.util.List;

public class Student {
    //You have a list of student objects, each containing the following attributes:
    //
    //name (String): The name of the student.
    //age (int): The age of the student.
    //subjects (List<String>): A list of subjects the student is enrolled in.
    //Your task is to find the average age of students who are enrolled in the subject "Mathematics".
    //
    //Instructions:
    //
    //Create a class Student with attributes name, age, and subjects.
    //Create a list of Student objects with varying attributes.
    //Use Java streams to filter out the students who are enrolled in "Mathematics".
    //Calculate the average age of these students.
    //Print the average age.

    private String name;
    private int age;
    private List<String> subjects;

    public Student(String name, int age, List<String> subjects) {
        this.name = name;
        this.age = age;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public static void main(String[] args){
        List<Student> students = Arrays.asList(
                new Student("Alice", 20, Arrays.asList("Mathematics", "Physics")),
                new Student("Bob", 22, Arrays.asList("Chemistry", "Mathematics")),
                new Student("Charlie", 21, Arrays.asList("Biology", "Mathematics")),
                new Student("David", 19, Arrays.asList("Mathematics", "Computer Science"))
        );

        double averageAge = students
                .stream()
                .filter(student -> student.getSubjects().contains("Mathematics"))
                .mapToInt(Student::getAge)
                .average()
                .orElse(0.0);

        System.out.println("Average age of students enrolled in Mathematics: " + averageAge);

        double averageAgeParallel = students
                .parallelStream()
                .mapToInt(Student::getAge)
                .average()
                .orElse(0.00);

        System.out.println("Average age in parallel: " + averageAgeParallel);
    }
}
