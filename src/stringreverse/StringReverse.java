/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringreverse;

import java.util.Scanner;

/**
 *
 * @author Saruf
 */
public class StringReverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Please enter a string: ");
            String strInput = sc.nextLine();
            int len = strInput.length();
            String strReverse = "";
            System.out.println("Reverse a string without using reverse function: ");
            for(int a = len - 1; a >= 0; a--)
            {
                strReverse = strReverse + strInput.charAt(a);
            }
            System.out.println(strReverse);
        }

    }
    
}
