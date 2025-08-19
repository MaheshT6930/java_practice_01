package org.example.multithreading;

public class Student {
    private String id;
    private String name;
    private String email;
    private String phNumber;


    public Student(){

    }

    public Student(String id, String  name, String email, String phNumber){
        this.name = name;
        this.email = email;
        this.id = id;
        this.phNumber = phNumber;


    }



    @Override
    public String toString(){
        return id + "  -  " + name + "   -   " + email + " - " + phNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName(){
        return name;
    }
     public String getPhNumber(){
        return phNumber;
     }
      public void setPhNumber(String phNumber){
        this.phNumber = phNumber;
      }

    public String getEmail(){
        return email;

    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }
}
