package org.example.multithreading;

import java.util.List;

public class StudentTask implements Runnable {
    private int start;
    private int end;
    private List<Student> studentList;

    public StudentTask(){

    }
    public StudentTask(int start, int end, List<Student> studentList){
        this.start = start;
        this.end = end;
        this.studentList= studentList;
    }



    @Override
    public  void  run(){
        for (int i = start; i <= end; i++){
            Student student = new Student(i +"", "student"+ i, "student"+i+"@gmail.com", "900000000" + i  );
            synchronized (studentList){
                studentList.add(student);
            }

        }
    }

}
