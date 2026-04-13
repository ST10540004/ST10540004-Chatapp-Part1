/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chatapppart1;

import java.util.Scanner;

/*import Java.util.Scanner;
 *
 * @author Student
 */
public class Mainapp {
    public static void main(String[]args){
        
        //The user is required to enter the required information by the scannner
          Scanner input =new Scanner (System.in);
          
        //Create an object of the Login class so we can call its methods
          Login login=new Login();
          
        //---Registration Section ----
        System.out.println("=== USER REGISTRATION===");
        
        System.out.print("Enter a username:");
         String username=input.nextLine();
         
        System.out.print("Enter a password:");
        String password= input.nextLine();
        
        System.out.print("Enter your South Africa phone number(+27...):");
        String phone = input.nextLine();
        
        //Call the user register method in order to store the message it returns
        String response = login.registerUser(username,password,phone);
        
        //Show the registration message
        System.out.println(response);
                
        //---Lgin section---
        System.out.println("\n===USER LOGIN===");
        
        System.out.print("Enter your username:");
        String loginUsername=input.nextLine();
        
        System.out.print("Enter your password");
        String loginPassword=input.nextLine();
        
        //Summon the loginUser
        boolean loggedIn = login.loginUser(loginUsername,loginPassword);
        
        //Summon the system to print out correct message
        String loginMessage = login.returnLoginStatus(loggedIn);
       System.out.println(loginMessage) ;
       
        
        
     
         
              
    }


    
}
