/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InheritancePractice;

import java.time.LocalDate;

/**
 *
 * @author Justin
 */
public class PartTime extends Employee {

      private int hoursWorked;
      private double hourlyWage;
    
    
    public PartTime(String firstName, String lastName, String gender, String position, String department, 
            double salary, int hoursWorked, LocalDate dateOfBirth, LocalDate dateOfHire){
        super(firstName, lastName, gender, department, position, dateOfBirth, dateOfHire);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }
    
     public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }
    
    public String toString(){
        return(super.toString()+ "\n" + getHoursWorked()+ "\n" + getHourlyWage()+ "\n");
    }
    
//    public double CalcualtePay(){
//        
//        parseDouble(hoursWorked);
//        return hoursWorked * hourlyWage;
//    } 

 
    
}
