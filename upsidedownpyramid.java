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
public class upsidedownpyramid {
    static String repeat;
    public static void main(String[] args) {
        Scanner reset = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of row: ");
        int num = input.nextInt();
        System.out.println("Pyramid: ");
        for(int i =0; i <= num; i++){
            for(int j=0; j< num-i; j++){
                System.out.print("*");
            }
           
            System.out.println();
        }
    }
}
