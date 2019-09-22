package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        com.company.Employee emp1 = new com.company.Employee;
        Employee emp1 = new Employee("mark", "00",90 );

        System.out.println(emp1);
//        Manager mng1 = new Manager();
        Manager mng1 = new Manager("Accounting","30",900, "oof");
        System.out.println(mng1);
    }

}
