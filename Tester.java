/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InheritancePractice;


import static InheritancePractice.ServiceClass.checkEmpty;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Justin
 */
public class Tester {
    
    /**
     *
     * @param args
     */
    
    
    
    public static void main(String[] args){
         
      
       //Storage array for information
       ArrayList<Person> myList = new ArrayList();
 
      
       
       //instance variables
       Scanner input = new Scanner(System.in); 
       String firstName, lastName, gender, position, department, paymentMethod; 
       int noOfEmManaged, hoursWorked, birthYear, hireYear, birthMonth, 
               hireMonth, birthDay, hireDay;
       LocalDate dateOfBirth, dateOfHire;
       double bonus, salary, hourlyWage, paymentAmount;
       boolean clubCard, checkEmpty = true;
       boolean runLoop = true;
       int choice = 0;
       
       //start of program using a try catch loop to continue running the program until user exit command
       try{
           do{
              
               ServiceClass.mainHello();
               
               ServiceClass.mainOptions();
               choice = input.nextInt();
               
               if(choice == 1)
               {
                   do
                   {
                       checkEmpty = false;
                        ServiceClass.getInfoPrompt(" First name: ");
                        firstName = new Scanner(System.in).nextLine();
                        if(ServiceClass.checkEmpty(firstName))
                        {
                            checkEmpty = true;
                            System.out.println("Please enter a valid first name. \n");
                        }
                   }while(checkEmpty);
                   
                   ServiceClass.getInfoPrompt(" Last Name: ");
                   lastName = new Scanner(System.in).nextLine();
                   ServiceClass.getInfoPrompt(" Gender: ");
                   gender = input.nextLine();
                   input.nextLine();
                   ServiceClass.getInfoPrompt(" position: ");
                   position = input.nextLine();
                   ServiceClass.getInfoPrompt(" department: ");
                   department = input.nextLine();
                   ServiceClass.getInfoPrompt(" number of Employees Managed: ");
                   noOfEmManaged = Integer.parseInt(input.nextLine());
                   ServiceClass.getInfoPrompt(" Bonus: ");
                   bonus = Double.parseDouble(input.nextLine());
      
                  
                   do
                    {
                        checkEmpty = false;
                        ServiceClass.getInfoPrompt(" Year of birth: ");
                        birthYear = new Scanner(System.in).nextInt();//1579
                        if(birthYear <1969 || birthYear > 2001)
                            checkEmpty = true;
                            System.out.println("Please enter a valid Year between 1969 and 2001. \n");
                    }while(checkEmpty);
 

                   ServiceClass.getInfoPrompt(" Birth Month by number eg 02 for Feb: ");
                   birthMonth = Integer.parseInt(input.nextLine());
                   ServiceClass.getInfoPrompt(" Birth Day: ");
                   birthDay = Integer.parseInt(input.nextLine());
                   ServiceClass.getInfoPrompt(" Year Hired: ");
                   hireYear = Integer.parseInt(input.nextLine());
                   ServiceClass.getInfoPrompt(" Month Hired: ");
                   hireMonth = Integer.parseInt(input.nextLine());
                   ServiceClass.getInfoPrompt(" Day Hired: ");
                   hireDay = Integer.parseInt(input.nextLine());
          
                          
          
                   //date of birth
                   dateOfBirth = LocalDate.of(birthYear, Month.of(birthMonth), birthDay);
                   //date of hire
                   dateOfHire = LocalDate.of(hireYear, Month.of(hireMonth), hireDay);
                   
                   myList.add(new Manager(firstName, lastName, gender, position, department, noOfEmManaged, bonus, dateOfBirth, dateOfHire));
                   System.out.println("Manager successfully created.");
                  
               }
               else if(choice == 2)
               {
                   do
                   {
                       checkEmpty = false;
                        ServiceClass.getInfoPrompt(" First name: ");
                        firstName = new Scanner(System.in).nextLine();
                        if(ServiceClass.checkEmpty(firstName))
                        {
                            checkEmpty = true;
                            System.out.println("Please enter a valid first name. \n");
                        }
                   }while(checkEmpty);
                   
                   ServiceClass.getInfoPrompt(" Last Name: ");
                   lastName = new Scanner(System.in).nextLine();
                   ServiceClass.getInfoPrompt(" Gender: ");
                   gender = input.nextLine();
                   input.nextLine();
                   ServiceClass.getInfoPrompt(" position: ");
                   position = input.nextLine();
                   ServiceClass.getInfoPrompt(" department: ");
                   department = input.nextLine();
                   ServiceClass.getInfoPrompt(" Salary: ");
                   salary = Double.parseDouble(input.nextLine());
                   ServiceClass.getInfoPrompt(" Weekly hours worked: ");
                   hoursWorked = Integer.parseInt(input.nextLine());
                   
                   do
                    {
                        checkEmpty = false;
                        ServiceClass.getInfoPrompt(" Year of birth: ");
                        birthYear = new Scanner(System.in).nextInt();//1579
                        if(birthYear <1969 || birthYear > 2001)
                            checkEmpty = true;
                            System.out.println("Please enter a valid Year between 1969 and 2001. \n");
                    }while(checkEmpty);
 
                   
                   ServiceClass.getInfoPrompt(" Birth Month by number eg 02 for Feb: ");
                   birthMonth = Integer.parseInt(input.nextLine());
                   ServiceClass.getInfoPrompt(" Birth Day: ");
                   birthDay = Integer.parseInt(input.nextLine());
                   ServiceClass.getInfoPrompt(" Year Hired: ");
                   hireYear = Integer.parseInt(input.nextLine());
                   ServiceClass.getInfoPrompt(" Month Hired: ");
                   hireMonth = Integer.parseInt(input.nextLine());
                   ServiceClass.getInfoPrompt(" Day Hired: ");
                   hireDay = Integer.parseInt(input.nextLine());
                   
                   //date of birth
                   dateOfBirth = LocalDate.of(birthYear, Month.of(birthMonth), birthDay);
                   //date of hire
                   dateOfHire = LocalDate.of(hireYear, Month.of(hireMonth), hireDay);
                   
                   myList.add(new FullTime(firstName, lastName, gender, position, department, salary, hoursWorked, dateOfBirth, dateOfHire));
                   System.out.println("Full Time Employee Successfully created");
                   
               }
               else if(choice == 3)
               {
                   do
                   {
                       checkEmpty = false;
                        ServiceClass.getInfoPrompt(" First name: ");
                        firstName = new Scanner(System.in).nextLine();
                        if(ServiceClass.checkEmpty(firstName))
                        {
                            checkEmpty = true;
                            System.out.println("Please enter a valid first name. \n");
                        }
                   }while(checkEmpty);
                   
                   ServiceClass.getInfoPrompt(" Last Name: ");
                   lastName = new Scanner(System.in).nextLine();
                   ServiceClass.getInfoPrompt(" Gender: ");
                   gender = input.nextLine();
                   input.nextLine();
                   ServiceClass.getInfoPrompt(" position: ");
                   position = input.nextLine();
                   ServiceClass.getInfoPrompt(" department: ");
                   department = input.nextLine();
                   ServiceClass.getInfoPrompt(" Hourly Wage: ");
                   hourlyWage = Double.parseDouble(input.nextLine());
                   ServiceClass.getInfoPrompt(" Weekly hours worked: ");
                   hoursWorked = Integer.parseInt(input.nextLine());
                   
                   do
                    {
                        checkEmpty = false;
                        ServiceClass.getInfoPrompt(" Year of birth: ");
                        birthYear = new Scanner(System.in).nextInt();//1579
                        if(birthYear <1969 || birthYear > 2001)
                            checkEmpty = true;
                            System.out.println("Please enter a valid Year between 1969 and 2001. \n");
                    }while(checkEmpty);
 
                   
                   ServiceClass.getInfoPrompt(" Birth Month by number eg 02 for Feb: ");
                   birthMonth = Integer.parseInt(input.nextLine());
                   ServiceClass.getInfoPrompt(" Birth Day: ");
                   birthDay = Integer.parseInt(input.nextLine());
                   ServiceClass.getInfoPrompt(" Year Hired: ");
                   hireYear = Integer.parseInt(input.nextLine());
                   ServiceClass.getInfoPrompt(" Month Hired: ");
                   hireMonth = Integer.parseInt(input.nextLine());
                   ServiceClass.getInfoPrompt(" Day Hired: ");
                   hireDay = Integer.parseInt(input.nextLine());
                   
                   //date of birth
                   dateOfBirth = LocalDate.of(birthYear, Month.of(birthMonth), birthDay);
                   //date of hire
                   dateOfHire = LocalDate.of(hireYear, Month.of(hireMonth), hireDay);
                   
                   myList.add(new PartTime(firstName, lastName, gender, position, department, hourlyWage, hoursWorked, dateOfBirth, dateOfHire));
                   System.out.println("Part Time Employee Successfully created");
                   
               }
               else if(choice == 4)
               {
                   do
                   {
                       checkEmpty = false;
                        ServiceClass.getInfoPrompt(" First name: ");
                        firstName = new Scanner(System.in).nextLine();
                        if(ServiceClass.checkEmpty(firstName))
                        {
                            checkEmpty = true;
                            System.out.println("Please enter a valid first name. \n");
                        }
                   }while(checkEmpty);
                   
                   ServiceClass.getInfoPrompt(" Last Name: ");
                   lastName = new Scanner(System.in).nextLine();
                   
                   ServiceClass.getInfoPrompt(" Birth Year: ");
                   birthYear = Integer.parseInt(input.nextLine());
                   input.nextLine();
                   ServiceClass.getInfoPrompt(" Birth Month by number eg 02 for Feb: ");
                   birthMonth = Integer.parseInt(input.nextLine());
                   ServiceClass.getInfoPrompt(" Birth Day: ");
                   birthDay = Integer.parseInt(input.nextLine());
                   ServiceClass.getInfoPrompt(" Gender: ");
                   gender = input.nextLine();
                   ServiceClass.getInfoPrompt(" Cost: ");
                   paymentAmount = Double.parseDouble(input.nextLine());
                   ServiceClass.getInfoPrompt(" How will you pay today: ");
                   paymentMethod = input.nextLine();
                   ServiceClass.getInfoPrompt(" Club card: true or false");
                   clubCard = Boolean.parseBoolean(input.nextLine());
                  
                    //date of birth
                   dateOfBirth = LocalDate.of(birthYear, Month.of(birthMonth), birthDay);
                   
                   myList.add(new Customer(firstName, lastName, dateOfBirth, gender, paymentMethod, paymentAmount, clubCard));
                   System.out.println("Successfully created");
               }
               
                else if (choice == 5) {
                    //asks who they want to search
                System.out.println("What Person do you want to find: ");
                String name = new Scanner(System.in).nextLine();
                //creates a temp array to store search name
                ArrayList<Person> searchList = new ArrayList();
                
                for(int index = 0;index<myList.size();index++)
                    
                    //compares names from index of templist and my list
                    if(myList.get(index).getFirstName().equals(name)){
                       searchList.add(myList.get(index));
                       System.out.println("Found! \n");
                       System.out.println(myList.get(index).toString());
                    }

                }

            
                    
               else if(choice ==6)
               {
                   System.out.println("Thank you for using JS Gas Station programs :)");
                   runLoop = false;
               }
               else
               {
                   System.out.println("Invalid entry. Please try again.");
               }
           }
           while(runLoop);
       }
       catch(InputMismatchException e)
       {
           
       }
      
        catch(Exception e)
        {
          
        }
         
     }
    
}
