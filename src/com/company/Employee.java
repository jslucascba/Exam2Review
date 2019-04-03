package com.company;

public class Employee {

    // Instance Variables
    String employeeID;
    String department;
    double billTime;
    double adminTime;
    double billPercent;

    // Class Variables
    static int count;

    //No Arg Constructor
    public Employee() {
    }

    //Full Constructor
    public Employee(String employeeID, String department, double billTime, double adminTime, double billPercent) {
        this.employeeID = employeeID;
        this.department = department;
        this.billTime = billTime;
        this.adminTime = adminTime;
        this.billPercent = billPercent;
    }

    //Getters and Setters
    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getBillTime() {
        return billTime;
    }

    public void setBillTime(double billTime) {
        this.billTime = billTime;
    }

    public double getAdminTime() {
        return adminTime;
    }

    public void setAdminTime(double adminTime) {
        this.adminTime = adminTime;
    }

    public double getBillPercent() {
        return billPercent;
    }

    public void setBillPercent(double billPercent) {
        this.billPercent = billPercent;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Employee.count = count;
    }

    //Common Methods
    public String toString(){
        return employeeID + "\t" + department + "\t" + billPercent;
    }

    public int compareTo(Employee compareVal){
        return this.department.compareTo(compareVal.getDepartment());
    }

    //Sort by Department Method
    public static void sortEmployees(Employee[] myEmployees){

        for(int i = 0; i<count-1; i++){
            int min = i;

            for(int j= i+1; j< count; j++){
                if(myEmployees[min].compareTo(myEmployees[j])<0){
                    min = j;
                }
            }

            if(min!=i){
                swap(myEmployees,min,i);
            }
        }
    }

    //Swap method
    public static void swap(Employee[] myEmployees, int min, int i){
        Employee temp = myEmployees[min];
        myEmployees[min] = myEmployees[i];
        myEmployees[i] = temp;
    }

}
