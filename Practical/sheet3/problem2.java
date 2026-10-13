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
public class problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner ("System.in");
        System.out.println(" Enter a integer number !!! " );
        int num = input.nextInt();
        for(int i = 0 ; i<= num ; i++ ){
            for(int j = 0 ; j<= i; j++){
                System.out.print(j);
            }
        }
        System.out.println();
    }
}
