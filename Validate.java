/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p0074;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Validate {
        public static int checkInt(String mess, int min, int max){
        int num;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print(mess);
            try{
                num = Integer.parseInt(sc.nextLine());
                if(num>=min&&num<=max) return num;
                else{
                    if(max==min) System.err.println("Invalid input, must be equal to: "+min);
                    else System.err.println("Invalid input, please enter in range: "+min+" to "+max);
                }
            }
            catch(NumberFormatException ex){ 
                System.err.println("Input must be an integer number, enter again ");
            }
        } while(true);
    }
}
