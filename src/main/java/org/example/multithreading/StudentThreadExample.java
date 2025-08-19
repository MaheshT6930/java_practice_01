package org.example.multithreading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentThreadExample {
    public static void main(String[] args){
        List<Student> studentList = Collections.synchronizedList(new ArrayList<>());

        Thread t1 = new Thread(new StudentTask(1, 50, studentList));
        Thread t2 = new Thread(new StudentTask(51, 100, studentList));
        Thread t3 = new Thread(new StudentTask(101, 150, studentList));
        Thread t4 = new Thread(new StudentTask(151, 200, studentList));

        t1.start();
        try {
            t1.join();
        }catch (InterruptedException e1){
            e1.printStackTrace();
        }

        t2.start();
        try {
            t2.join();

        }catch (InterruptedException e2){
            e2.printStackTrace();
        }

        t3.start();
        try {
            t3.join();
        }catch (InterruptedException e3){
            e3.printStackTrace();
        }

        t4.start();
        try {
            t4.join();
        }catch (InterruptedException e4){
            e4.printStackTrace();
        }
        // Sort
        //studentList.sort(Comparator.comparing(Student::getId));
        //print students

        for (Student s: studentList){
            System.out.println(s);
        }
        System.out.println("\nTotal Students: " + studentList.size());

        //Sending Wishes

        List<Student> part1 = studentList.subList(0, 65);
        List<Student> part2 = studentList.subList(65, 130);
        List<Student> part3 = studentList.subList(130, 200);

        Thread sender1 = new Thread(new WishingStudents(part1));
        Thread sender2 = new Thread(new WishingStudents(part2));
        Thread sender3 = new Thread(new WishingStudents(part3));

        sender1.start();
        sender2.start();
        sender3.start();

try {
    sender1.join();
    sender2.join();
    sender3.join();
}catch (InterruptedException e){
    e.printStackTrace();
}
        System.out.println("\nAll wishes sent");


    }
}
