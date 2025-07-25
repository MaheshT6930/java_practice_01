package org.example.enums;

public enum employeeEnum {

    Mahesh("IT", 2),
    Suresh("HR", 3);

    public String empDept;
    public int empExperiance;
    employeeEnum(String empDept,int empExperiance){
        this.empDept= empDept;
        this.empExperiance = empExperiance;
    }

    public String getEmpDept() {
        return empDept;
    }
    public int getEmpExperiance(){
        return empExperiance;
    }

    public static void main(String[] args){
        for (employeeEnum emp : employeeEnum.values()) {
            System.out.println("Employee Name: " + emp.name());
            System.out.println("Department: " + emp.getEmpDept());
            System.out.println("Experience: " + emp.getEmpExperiance() + " years");
            System.out.println("---------------");
        }

    }
}
