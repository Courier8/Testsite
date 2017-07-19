/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egypt;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Administrator PC
 */
public class numericpyramid4 {

    static String repeat;

    public static void main(String[] args) {
        Pattern pat = Pattern.compile("^\\d+$");
        Scanner reset = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        int numrow = 0;
        Matcher numbmatch;
        do {
            System.out.println("How many row?");

            String num = input.nextLine();
            numbmatch = pat.matcher(num);

            if (numbmatch.matches()) {
                numrow = Integer.parseInt(num);
                /* int spacecount = numrow -1;
        int starcount = 1;*/
                int rowcount = numrow;
                for (int i = 0; i < numrow; i++) {
                    System.out.println();
                    //int spacein = numrow - abs(1-numrow);
                    for (int j = 1; j <= i * 2; j++) {
                        System.out.print(" ");
                    }

                    for (int j = 1; j <= rowcount; j++) {
                        System.out.print(j + " ");
                    }
                    for (int j = rowcount - 1; j >= 1; j--) {
                        System.out.print(j + " ");
                    }

                    rowcount--;

                }
            } else {
                System.out.println("Invalid Input");
            }
            System.out.println();
            System.out.println("Again? ");
            repeat = reset.nextLine();
        } while (repeat.equalsIgnoreCase("Y"));
    }
}
