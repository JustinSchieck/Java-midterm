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
public abstract class Person {
    
    private String firstName;
    private String lastName;
    private String gender;
    private LocalDate dateOfBirth;
    
    public Person(){
        
    }
    
    public Person(String firstName, String lastName, String gender, LocalDate dateOfBirth){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getGender() {
        return gender;
    }

    private void setGender(String gender) {
        this.gender = gender;
    }
    
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
     public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    @Override
    public String toString(){
        return(getFirstName() + "\n" + getLastName() + "\n" + getGender() + "\n" + getDateOfBirth()+ "\n");
    }
    
    
}
