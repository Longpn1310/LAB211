
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
public class main {
    
    public static void main(String[] args) {
        checkvalid a = new checkvalid();
        option1 op = new option1();
        List<expense> list = new ArrayList<>();
        list.add(new expense(1, "11-Apr-2009", 100, "Tuition fee"));
        list.add(new expense(2, "20-Apr-2009", 250, "Rent house"));
        list.add(new expense(3, "30-Apr-2009", 200, "Food"));
        int choice;
        do{
            op.menu();
            choice = a.checkint("choice: ",1,4);
            switch (choice){
                case 1:
                    op.add(list);
                    break;
                case 2:
                    op.display(list);
                    break;
                case 3: 
                    op.delete(list);
                    break;          
                }
        }while(choice != 4);
    }
}
