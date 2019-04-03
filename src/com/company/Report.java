package com.company;

public class Report {

    public static void rangeReport(Employee[] myEmployees){

        double total = myEmployees[0].getBillTime();
        double min = myEmployees[0].getBillTime();
        double max = myEmployees[0].getBillTime();

        for(int i = 1; i<Employee.getCount(); i++){

            if(min > myEmployees[i].getBillTime()){
                min = myEmployees[i].getBillTime();
            }
            if(max < myEmployees[i].getBillTime()){
                max = myEmployees[i].getBillTime();
            }

            total += myEmployees[i].getBillTime();
        }

        System.out.println("Range : " + (max-min) + " Average : " + (total/Employee.getCount()));
    }

    public static void billPercentByDepartment(Employee[] myEmployees){

        String current = myEmployees[0].getDepartment();
        double deptTotal = myEmployees[0].getBillPercent();
        int deptCount = 1;

        for(int i = 1; i<Employee.getCount(); i++){
            if(!current.equals(myEmployees[i].getDepartment())){
                System.out.println(current + ": " + (deptTotal / deptCount));
                current = myEmployees[i].getDepartment();
                deptTotal = myEmployees[i].getBillPercent();
                deptCount = 1;
            }
            else{
                deptTotal += myEmployees[i].getBillPercent();
                deptCount++;
            }
        }

        System.out.println(current + ": " + (deptTotal / deptCount));
    }
}
