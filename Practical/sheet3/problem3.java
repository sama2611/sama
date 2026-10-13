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
public class problem3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner ("System .in");
        int num = input.nextInt();
        int rev =0  ;
        while(num>0){
        int digit = num % 10 ;
       rev = rev * 10 + digit ;
       num = num /10 ;
     
    }
        System.out.println("the reverse number is :" + rev);
    }
}
