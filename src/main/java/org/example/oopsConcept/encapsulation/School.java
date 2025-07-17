package org.example.oopsConcept.encapsulation;

public class School {
    public Student admitStudent(String name, int age, String grade) {
        return new Student(name, age, grade);
    }
}
