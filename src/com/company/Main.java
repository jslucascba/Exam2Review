package com.company;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
	// write your code here

        // create and populate array
        Employee[] myEmployees = EmployeeFile.getAllEmployees();

        // Sort by department
        Employee.sortEmployees(myEmployees);

        //Run Reports
        Report.rangeReport(myEmployees);
        Report.billPercentByDepartment(myEmployees);

    }
}
