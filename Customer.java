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
public class Customer extends Person{
    
    private String paymentMethod;
    private double paymentAmount;
    private boolean clubCard;
    
    public Customer(String firstName, String lastName, LocalDate dateOfBirth, String gender, String paymentMethod, double paymentAmount, boolean clubCard){
        super(firstName, lastName, gender, dateOfBirth);
        this.paymentMethod = paymentMethod;
        this.paymentAmount = paymentAmount;
        this.clubCard = clubCard;
       
    }

   

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    
     
    public boolean getClubCard() {
        return clubCard;
    }

    public void setClubCard(boolean clubCard) {
        this.clubCard = clubCard;
    }

   @Override
    public String toString(){
        return(super.toString()+ "\n" + getPaymentMethod()+ "\n" + getPaymentAmount() + "\n" + getClubCard()+ "\n");
    }
    
}
