    package p0074;

import java.util.Scanner;

public class P0074 {
    public static void main(String[] args) {
        Option op = new Option();
        do{ 
            System.out.println("======= Calculator Program =======");
            System.out.println("1. Matrix Addition ");
            System.out.println("2. Matrix Subtraction ");
            System.out.println("3. Matrix Multiplication ");
            System.out.println("4. Quit ");
            int choice = Validate.checkInt("Your choice: ", 1, 4);
            switch(choice){
                case 1:{
                    op.prepare('+');
                    break;
                }
                case 2:{
                    op.prepare('-');
                    break;
                }
                case 3:{
                    op.prepare('*');
                    break;
                }
                case 4:{
                    return;
                }
            }
        } while(true);
        
    }
    
}
