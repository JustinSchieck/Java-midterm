/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InheritancePractice;

/**
 *
 * @author Justin
 */
public class ServiceClass {
    
    private static int empId = 10000;
    
    public static int getEmpId(){
        return ++empId;
    }
    
    public static void mainHello(){
        System.out.println("Welcome to JS Industries!");
    }
    
    public static void mainGoodbye(){
        System.out.println("Goodbye! :)");
                
        }
    
        public static void mainOptions()
    {
        System.out.println("Please Select one of the following options: \n" + 
                "1. Create new manager \n" + "2. Create a new Full Time Employee \n" + 
                "3. Create a new Part Time Employee \n" +  "4. Create a new Customer \n" +
                "5. Search for Person \n" +
                "6. Exit");
        
    }
        
        public static void getInfoPrompt(String data)
        {
            System.out.println("Please enter" + data);
        }

         public static boolean checkEmpty(String data)
         {
            if(data.isEmpty())
            {
             return true;
            }
            else 
            {
             return false;
            }
         }
}
