package com.company;
import java.util.Scanner;
import java.io.*;

public class EmployeeFile {

    public static Employee[] getAllEmployees() throws IOException{

        //declare the array to populate
        Employee[] myEmployees = new Employee[50];

        //open the file
        Scanner inFile = new Scanner(new File("input.txt"));

        //Process the file
        while(inFile.hasNext()){

            String line = inFile.nextLine();
            String[] temp = line.split("#");

            double billTime = Double.parseDouble(temp[2]);
            double adminTime = Double.parseDouble(temp[3]);
            double billPercent = billTime / (billTime+adminTime);

            myEmployees[Employee.getCount()] = new Employee(temp[0],temp[1],billTime,adminTime,billPercent);

            Employee.setCount(Employee.getCount() + 1);

        }

        // close the file
        inFile.close();

        //return the array
        return myEmployees;
    }
}
