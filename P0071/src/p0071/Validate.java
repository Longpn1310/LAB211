/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p0071;

/**
 *
 * @author laptop
 */
import java.text.SimpleDateFormat;
import java.util.Scanner;
public class Validate {

	Scanner sc = new Scanner(System.in);

	public int checkChoice(String mess) {
		int choice;
		while(true) {
			try {
				System.out.print(mess);
				choice = Integer.parseInt(sc.nextLine());
				if (choice > 4 || choice < 1) {
					System.out.println("Please choose from 1 to 4");

				}else 
					return choice;
			}catch (Exception e) {
				// TODO: handle exception
				System.out.println("Invalid choice!!");
			}
		}
	}

	public String checkText(String mess) { //Check name, assignee, reviewer
		//NOT INPUT SPACE/EMPTY STRING/NUMBER IN STRING NAME
		String name ;
		while(true) {
			System.out.print(mess);
			name = sc.nextLine();
			if (name.isEmpty()==true||name.matches(".*\\d.*")) {
				System.out.println("Enter again!!! ");
			}
			else {
				return name;
			}
		}
	}

	public String checkDate(String mess) {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		dateFormat.setLenient(false);
		String input;
		while (true) {
			try {
				System.out.print(mess);
				input = sc.nextLine();
				if(!input.matches("^\\d+[-]\\d+[-][^0]\\d\\d\\d")) {
					System.out.println("Please input valid date (dd-MM-yyyy)");
				}else {
					dateFormat.parse(input.trim());
					return input;	
				}
			} catch (Exception e) {
				System.out.println("Please input valid date (dd-MM-yyyy)!!");
			}
		}
	}
	public double checkFrom(String mess) {
		double from;
		while(true) {
			try {
				System.out.print(mess);
				from = Double.parseDouble(sc.nextLine().trim());
				String gString= Double.toString(from);
				if (!gString.matches("^[8-9]([.][5|0]0*)?|1[0-7]([.][5|0]0*)?")) {
					System.out.println("Please input plan from 8.0, 8.5, 9.0, ⇔ 9.5 ...-> 17.5");
				}else
					return from;
			} catch (Exception e) {
				System.out.println("Invalid double");
			}
		} 		
	}

	public double checkTo(double from) {
		double to;
		while(true) {
			try {
				System.out.print("To: ");
				to = Double.parseDouble(sc.nextLine().trim());
				String gString= Double.toString(to);
				if (to<=from) {
					System.out.println("Plan to should greater than Plan-from!!!!");
				}
				else if (!gString.matches("^[8-9]([.][5|0]0*)?|1[0-7]([.][5|0]0*)?")) {
					System.out.println("Please input plan from 8.0, 8.5, 9.0, ⇔ 9.5 ...-> 17.5");
				}
				else
					return to;				
			} catch (NumberFormatException e) {
				System.out.println("Invalid type of Number, please enter again!!");
			}
		}
	}

	public int checkID(String mess) {
		int id;
		while(true) {
			try {
				System.out.print(mess);
				id = Integer.parseInt(sc.nextLine().trim());
				if(id<0) {
					System.out.println("Invalid Id, please enter again!!");
				}else 
					return id;

			} catch (Exception e) {
				System.out.print("Please input valid id: ");
			}
		} 		
	}
}
