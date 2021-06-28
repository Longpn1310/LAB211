
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author svdtx
 */
public class option1 {
    checkvalid a = new checkvalid();
    
    
    public void add(List<expense> list){   
         System.out.println("--------Add an Expense--------");
         int id = list.size()+1;
         String date = a.checkdate("Enter Date: ");
         double amount = a.checkd("Enter Amount: ",0,Double.MAX_VALUE);
         String content = a.checkst("Enter Content: ","[a-zA-Z ]+");
         list.add(new expense(id, date, amount, content));
         System.out.println("");
         
    } 
            
    
    public void display(List<expense> list){
        System.out.println("--------Display all expenses--------");
        double total = 0;
        System.out.println("ID\tDate\tAmount\tContent");
        for (expense o : list) {
            System.out.println(o);
            total += o.getAmount();
        }
        System.out.println("\t\tTotal: "+total);
        System.out.println("");
    }
    
     public void delete(List<expense> list){   
         System.out.println("--------Delete an expense--------");
         int id = a.checkint("Enter ID: ", 1, list.size()+1);
         
         
             list.remove(id-1);
         for(int i = id-1;i < list.size();i++){
             list.get(i).setId(id+1);}
         }
        
     

     public void menu(){
         System.out.println("=======Handy Expense program======");
         System.out.println("1. Add an expense");
         System.out.println("2. Display all expenses");
         System.out.println("3. Delete an expense");
         System.out.println("4. Quit");
        
}
}
