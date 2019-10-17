/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwitchForAndNested;

/**
 *
 * @author MC03353
 */
public class NestedLoops {
    
    static void nestedLoops(int rows){
//        int rows = 5;

        //for(int i = 1; i <= rows; ++i)
        for(int i = 1; i <= rows; ++i){
            for(int j = 1; j <= i; ++j){
                System.out.print(j + " ");
            }//end of inner loop
            System.out.println("");
        }//end of outter loop
    }//end of nestedLoops
}//end of class
