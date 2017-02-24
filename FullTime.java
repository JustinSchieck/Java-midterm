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
public class FullTime extends Employee {
        
    private double salary;
    private int hoursWorked;
    
    public FullTime(String firstName, String lastName, String gender, String position, String department, double salary, int hoursWorked , 
            LocalDate dateOfBirth, LocalDate dateOfHire){
        super(firstName, lastName, gender, department, position, dateOfBirth, dateOfHire);
        this.salary = salary;
        this.hoursWorked = hoursWorked;
        
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    
    @Override
    public String toString(){
        return(super.toString()+ "\n" + getSalary()+ "\n" + getHoursWorked()+ "\n");
    }
}
