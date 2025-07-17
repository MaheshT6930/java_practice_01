package org.example.oopsConcept.encapsulation;

public class Teacher {
    public void displayStudentInfo(Student student) {
        System.out.println("Student Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Grade: " + student.getGrade());
    }
}
