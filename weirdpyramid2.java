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
public class weirdpyramid2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter row: ");
        int rows = input.nextInt();
        System.out.println("Pyramid: ");
        for(int i=0; i < rows; ++i){
            for(int j=0; j < i;++j ){
                System.out.print(" ");
            }
            for(int k = i; k < rows; ++k){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
