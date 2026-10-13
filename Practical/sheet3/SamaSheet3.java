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
public class SamaSheet3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner ("System.in");
        int num , largest = 0;
        System.out.println("Please enter a positive number and stop at zero !");
        num = input.nextInt();
        while(num!=0){
          
            if (num>largest){
                largest = num ;
                System.out.println("ENTER THE NEXT POSTIVE NUMBER !!!");
            }
            num = input.nextInt();
        }
        System.out.println("The largest number is = "+ largest);
    }
    
}
