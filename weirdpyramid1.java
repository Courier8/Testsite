/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egypt;

import java.util.Scanner;

/**
 *
 * @author Administrator PC
 */
public class weirdpyramid1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter row: ");
        int rows = input.nextInt();
        System.out.println("Pyramid: ");
        for (int i = 0; i < rows; ++i) {
            for (int j = i; j < rows - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        /* for(int i=0; i <= rows; i++){
            for(int j=0; j <= rows-i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k <= rows; k++){
                System.out.print("*");
            }
            System.out.println();
        }*/
    }

}
