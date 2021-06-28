/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0073;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fulls
 */
public class Option {
    Validate v = new Validate();
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    
    public void add(ArrayList<Expense> list) throws IOException {
        //get new ID
        int id = list.get(list.size() - 1).getId() + 1;
        String date = v.getDate();
        double amount = v.getAmount();
        System.out.print("Input Content");
        String content = bf.readLine();
        Expense e = new Expense(id, date, amount, content);
        list.add(e);
    }

    public void display(ArrayList<Expense> list) {
        double total = 0;
        System.out.println("ID\tDATE\t\tAmount of money\t\tContent");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
            total += list.get(i).getAmount();
        }
        System.out.println("\t\tTotal: " + total);
    }

    public void remove(ArrayList<Expense> list, int id) {
        int index = 0;
        boolean check = true;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).getId() == id) {
                list.remove(i);
                index = i;
                check = false;
                break;
            }
        }
        for (int i = index; i < list.size(); i++) {
            list.get(i).setId(i+1);
        }
        if (check) {
            System.err.println("Delete an expens fail!");
        }
    }
}
