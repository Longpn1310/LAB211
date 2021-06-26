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
public class P0071 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Validate v= new Validate();
		TaskManagement t = new TaskManagement();
		while(true) {
			System.out.println();
			System.out.println("========= Task Program =========");
			System.out.println("1. Add task");
			System.out.println("2. Delete task");
			System.out.println("3. Show task");
			System.out.println("4. Exit");
			int choice = v.checkChoice("Enter your choice: ");
			switch (choice) {
			case 1:
				System.out.println("----------------- Add Task -----------------");
				t.addTask();
				break;
			case 2:
				System.out.println("------------------ Del Task ----------------");
				t.deleteTask();
				break;
			case 3:
				t.display();
				break;
			case 4:
				System.exit(0);
			}
		}
    }
    
}
