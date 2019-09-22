package com.company;

public class Manager extends Employee{
//    extends calls attributes from employee to manager coz manager is 1stly an employee
//    private int empID;
//    private String name;
//    private String ssn;
//    private double salary;
    private String deptName;

    public Manager(String name, String ssn, double salary, String deptName) {
        super(name, ssn, salary);
        this.deptName = deptName;
    }

    public Manager(String name, String ssn, String deptName) {
        super(name, ssn);
        this.deptName = deptName;
    }

    public Manager(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "deptName='" + deptName + '\'' +
             super.toString() +  '}';
    }
}
