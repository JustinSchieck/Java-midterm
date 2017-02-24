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
public abstract class Employee extends Person {
    
    private String department;
    private String position;
    private LocalDate dateOfHire;

      
    
    public Employee() {
      this.department = "";
      this.position = "";
    }
    
    public Employee(String firstName, String lastName, String gender, String department, String position, LocalDate dateOfBirth, LocalDate dateOfHire){
       super(firstName, lastName, gender, dateOfBirth);
       this.department = department;
       this.position = position;
       this.dateOfHire = dateOfHire;
    }
    


    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
    public LocalDate getDateOfHire() {
        return dateOfHire;
    }

    public void setDateOfHire(LocalDate dateOfHire) {
        this.dateOfHire = dateOfHire;
    }
    
    @Override
    public String toString(){
        return(super.toString()+ "\n" + getDepartment() + "\n" + getPosition()+ "\n" + getDateOfHire() + "\n");
    }
}
