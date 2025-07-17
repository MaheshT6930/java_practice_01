package org.example.oopsConcept.encapsulation;

public class Main {
    public static void main(String[] args) {
        School school = new School();
        Student s1 = school.admitStudent("Mahesh", 16, "10th");

        Teacher teacher = new Teacher();
        teacher.displayStudentInfo(s1);

        // Updating student info using setters
        s1.setGrade("11th");
        System.out.println("Updated Grade: " + s1.getGrade());
    }
}
