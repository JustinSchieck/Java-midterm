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
public class Manager extends Employee{
        
    private int noOfEmManaged; 
    private double bonus;
    
    
    public Manager(String firstName, String lastName, String gender, String position, String department, int noOfEmManaged, double Bonus, LocalDate dateOfBirth, LocalDate dateOfHire){
       super(firstName, lastName, gender, position, department, dateOfBirth, dateOfHire);
       this.noOfEmManaged = noOfEmManaged;
       this.bonus = bonus;
    }

    public int getNoOfEmManaged() {
        return noOfEmManaged;
    }

    public void setNoOfEmManaged(int noOfEmManaged) {
        this.noOfEmManaged = noOfEmManaged;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
  

    
    @Override
    public String toString(){
        return(super.toString()+ "\n" + getNoOfEmManaged()+ "\n" + getBonus()+ "\n");
    }
    
}
