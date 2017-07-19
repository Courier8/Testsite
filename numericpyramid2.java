/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egypt.Testsite;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Administrator PC
 */
public class numericpyramid2 {
     static String repeat;
    public static void main(String[] args) {
        Pattern pat = Pattern.compile("^\\d+$");
        Scanner reset = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
         int numrow =0;
        Matcher numbmatch;
        do{
        System.out.println("How many row?");
       
        String num = input.nextLine();
        numbmatch = pat.matcher(num);
        if(numbmatch.matches()){
            numrow = Integer.parseInt(num);
       /* int spacecount = numrow -1;
        int starcount = 1;*/
        for(int i = 1; i <= numrow;i++){
            System.out.println();
            for(int j = i; j < numrow;j++){
                System.out.print(" ");
            }
            for(int k = 1;k <(i*2) ;k++){
                System.out.print(i);
                }
            }
        }
        else {
            System.out.println("Invalid Input");
        }
            System.out.println();
            System.out.println("Again? ");
            repeat= reset.nextLine();
        }while(repeat.equalsIgnoreCase("Y"));  
    }
}
