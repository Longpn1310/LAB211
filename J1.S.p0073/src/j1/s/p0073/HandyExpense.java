/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0073;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Fulls
 */
public class HandyExpense {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        HandyExpense h = new HandyExpense();
        ArrayList list = new ArrayList();
        Option o = new Option();
        Validate v = new Validate();
        list.add(new Expense(1, "20-2-2020", 1000, "House"));
        list.add(new Expense(2, "20-2-2020", 200, "Laptop"));
        list.add(new Expense(3, "20-2-2020", 100, "Anhihi"));
        list.add(new Expense(4, "20-2-2020", 100, "Bhihi"));
        int choice;
        while (true) {
            h.menu();
            choice = v.getChoice();
            switch (choice) {
                //call method
                case 1:
                    o.add(list);
                    break;
                //call display method
                case 2:
                    o.display(list);
                    break;
                //call remove method
                case 3:
                    o.remove(list, v.checkID());
                    break;
                //exit
                case 4:
                    System.exit(0);
            }
            System.out.println("---------------------------------------");
        }
    }

    public void menu() {
        System.out.println("1. Add an expense");
        System.out.println("2. Display all expenses");
        System.out.println("3. Remove an expense");
        System.out.println("4. Exit");
    }
}
