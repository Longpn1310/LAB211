
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author svdtx
 */
public class checkvalid {

    Scanner sc = new Scanner(System.in);

    public int checkint(String s, int min, int max) {
        int num = 0;
        boolean c;
        do {
            c = true;
            System.out.print(s);
            try {
                num = Integer.parseInt(sc.nextLine().trim());
                if (num < min || num > max) {
                    System.out.println("Out of range!");
                    c = false;
                }else{
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.print("Error");
                System.out.print("Input again");
            }
        } while (c);
        return num;
    }

    public double checkd(String s, double min, double max) {
        double num = 0;
        boolean c;
        do {
            c = true;
            System.out.print(s);
            try {
                num = Double.parseDouble(sc.nextLine().trim());
                if (num < min || num > max) {
                    System.err.println("Out of range");
                    c = false;
                } else {
                    break;

                }
            } catch (NumberFormatException e) {
                System.err.print("Wrong input");
                System.out.print("Please try again");
            }
        } while (c);
        return num;
    }

    public String checkst(String s, String f) {
        String st;
        do {
            System.out.print(s);
            st = sc.nextLine().trim();
            if (st.matches(f)) {
                break;
            }
        } while (true);
        return st;
    }

    public String checkdate(String s) {
        SimpleDateFormat sin = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat sout = new SimpleDateFormat("dd-MMM-yyyy");
        //ngắt tự động tăng ngày
        sin.setLenient(false);
        Date date = null;
        do {
            try {
                System.out.println(s);
                date = sin.parse(sc.nextLine());
                break;
            } catch (Exception e) {
                System.err.print("Invalid!Please re-enter: ");
            }
        } while (true);
        return sout.format(date);
    }
}
