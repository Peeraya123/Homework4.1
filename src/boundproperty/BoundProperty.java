/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundproperty;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class BoundProperty {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Football Score Ex Thai 2-0 UAE \n Exit program Please Enter");
            String input = sc.nextLine();
            if ("".equals(input)) {  
                System.out.println("No input");
                return ;
            }
            else {  
                Football football = new Football();  
	Football1 football1 = new Football1(); 
	Football2 football2 = new Football2(); 
                football.addPropertyChangeListener(football1); // คนที่1
                football.addPropertyChangeListener(football2);  //คนที่2
                football.setValue(input);
            }
        }

    }
}
