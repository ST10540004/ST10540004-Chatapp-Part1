/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chatapppart1;

/**
 *
 * @author Student
 */
public class Login {
    //This variables contains the details of the user will use to login in
      String username;
      String password;
      String phoneNumber;
      
      // Declaring checkuser validation
         public boolean checkUserName(String username){
      
      //username should contain underscore that is less than 5 characters
        return username.contains ("")&& username.length()<=5;
         }
        
      
        
     
        // Declaring a password user validation
           public boolean checkPasswordComplexity(String password){
               
           boolean hasCapital = false;
           boolean hasNumber = false;
           boolean hasSpecial = false;
           
           // Password should contain all the neessary characters 
              for (int i =0; i < password.length();i++){
                  
                  char c = password.charAt(i);
                  // declare the character used
                  if (Character.isUpperCase(c)){
                  hasCapital=true;
              } else if (Character.isDigit(c)){
                  hasNumber=true;
              } else if (!Character.isLetterOrDigit(c)) {
                  hasNumber=true;
              }  
          
        }
                return password.length() >=8 && hasCapital && hasNumber && hasSpecial;
   
                
           }
           
           //Declaring cellphone number validation,South Africa code
             public boolean CheckCellNumber(String phone){
                 return phone.startsWith("+27") && phone.length()<=12;
                 
                 
             }
               public String registerUser(String username,String password, String phone){
                   
                   if(!checkUserName(username)){
                   return "Username is not correctly formatted;please ensure that your username contains an underscore and is no more than five characters in length.";
                   }
                               
                       
                   if (!checkPasswordComplexity(password)){ 
                   return"Password is not corrected formatted;please ensure that the password contains at least characters,a capital letter,a nummber and a special character.";
                   }
                   
                   if(!CheckCellNumber(phoneNumber)){
                    return "Cell phone number incorrectly formatted or does not contain international code.";
                           
                   }
                   
                   this. username=username;
                   this.password=password;
                   this.phoneNumber=phoneNumber;
                   
                   return"User registered successfully";
               }
             
             
             //Declaring Login Feature for user to use the same login details 
               public boolean loginUser(String username,String password) {
                   return this.username.equals(username) && this.password.equals(password);
               }
               
                public String returnLoginStatus(boolean success){
                     if (success){
                        return "welcome" +username+"it is great to see you again ";
                     } else{
                         return "Username or password incorrect,please try again.";
                     }
                }            


    
                
}                