package com.company;

public class Employee {
    private int empID;
    private String name;
    private String ssn;
    private double salary;
    private static int counter = 0;

    public Employee(String name, String ssn, double salary) {
        this.empID = ++counter;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }

    public Employee(String name, String ssn) {
        this.empID = ++counter;
        this.name = name;
        this.ssn = ssn;
    }

    //empty constructor
    public Employee() {
        this.empID = ++counter;


    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empID=" + empID +
                ", name='" + name + '\'' +
                ", ssn='" + ssn + '\'' +
                ", salary=" + salary +
                '}';
    }
}

