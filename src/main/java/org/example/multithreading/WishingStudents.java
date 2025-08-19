package org.example.multithreading;

import java.util.List;



public class WishingStudents implements Runnable {
    private List<Student> students;

    public WishingStudents(List<Student> students){
        this.students = students;
    }

    @Override
    public void run() {
        for(Student s : students){
            System.out.println("Happy New Year to  " + s.getName());
        }
    }
}
