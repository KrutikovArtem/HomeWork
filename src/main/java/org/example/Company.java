package org.example;

public class Company {
    static String companyName = "BMW";
    final int EMPLOYEE_ID;
    String employeeName;

    Company(String employeeName, int id) {
        this.employeeName = employeeName;
        this.EMPLOYEE_ID = id;
    }

    static void printCompanyName() {
        System.out.println(companyName);
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}
