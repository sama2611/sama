/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sama.sheet3;

import java.util.Scanner;

/**
 *
 * @author STUDENT
 */
public class problem4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner ("System.in");
       System.out.println("Please enter a positive number !!!!");
       int num = input.nextInt();
       int div = 0 ;
       for(int i = 2; i<=num;i++){
           if(num%i==0){ 
               div ++;
           }
       }
       if(div > 0){
         System.out.println("This number is prime");  
       }
       else{
           System.out.println("This number is not prime");
       }
    }
    
}
