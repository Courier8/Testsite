/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egypt.Testsite;

import java.util.Scanner;

/**
 *
 * @author Administrator PC
 */
public class onesidepyramid {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.print("Enter number of row: ");
        int num = input.nextInt();
        System.out.println("Pyramid: ");
        for(int i =0; i < num; i++){
            for(int k=0; k<= i; k++){
                System.out.print("*");
            }
          
            System.out.println();
        }
    }
}
