/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwitchForAndNested;

import javax.swing.JOptionPane;

/**
 *
 * @author MC03353
 */
public class SwitchStatement {
    
    static void switchMonths(){
    // take input 
    String jInput = JOptionPane.showInputDialog("Input a number between 1 and 12");
    //parse string as int 
    int iMonth = Integer.parseInt(jInput);

        // statements assigning a value to day.
        switch(iMonth)        
        {
            case 1:System.out.println("January");
                   break;							
            case 2:System.out.println("February");
                   break;										
            case 3:System.out.println("March");
                   break;										
            case 4:System.out.println("April");
                   break;										
            case 5:System.out.println("May");
                   break;										
            case 6:System.out.println("June");
                   break;											
            case 7:System.out.println("July");
                   break;											
            case 8:System.out.println("August");
                   break;	
            case 9:System.out.println("September");
                   break;	
            case 10:System.out.println("October");
                   break;	            
            case 11:System.out.println("November");
                   break;	
            case 12:System.out.println("December");
                   break;	            
            default:System.out.println("Oops:an invalid month number");
        } // end of  switch	   
    }// end of switchMonths  
}//end of class
