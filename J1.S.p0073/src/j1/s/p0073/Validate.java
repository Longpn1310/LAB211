/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0073;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Fulls
 */
public class Validate {

    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    //method get amount of expens
    public double getAmount() {
        double amount = 0;
        while (true) {
            try {
                System.out.print("input amount: ");
                amount = Double.parseDouble(bf.readLine());
                break;
            } catch (Exception e) {
                System.err.println("invalid amount, please input again");
            }
        }
        return amount;
    }

    //method get date of expens
    public String getDate() {
        //11-03-2009 -->
        //--> 11-Apr-2009
        SimpleDateFormat dfIn = new SimpleDateFormat("dd-MM-yyyy");//hh:mm:ss
        //check date exeption
        //tắt cộng dồn
        dfIn.setLenient(false);
        SimpleDateFormat dfOut = new SimpleDateFormat("dd-MMM-yyyy");//hh:mm:ss
        Date date;
        while (true) {
            try {
                System.out.print("Input Date: ");
                date = dfIn.parse(bf.readLine());
                break;
            } catch (Exception e) {
                System.err.println("invalid date, please input again");
            }
        }
        return dfOut.format(date);
    }

    public int getChoice() {
        int choice;
        while (true) {
            try {
                System.out.print("Input Choice: ");
                choice = Integer.parseInt(bf.readLine());
                break;
            } catch (Exception e) {
                System.err.println("invalid Choice, please input again");
            }
        }
        return choice;
    }

    public int checkID() {
        int n;
        while (true) {
            try {
                System.out.println("Input ID: ");
                n = Integer.parseInt(bf.readLine());
                break;
            } catch (Exception e) {
                System.err.println("invalid ID, please input again");
            }
        }
        return n;
    }
}
