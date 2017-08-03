/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordscramble;

import java.util.Scanner;

/**
 *
 * @author linah 
 * UVA
 * ID: 483
 */
public class WordScramble {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        String str;

        while (input.hasNext()) {
            str = input.nextLine();
            String[] ara = str.split(" ");

            for (int i = 0; i < ara.length; i++) {

                StringBuffer tmp1 = new StringBuffer(ara[i]);
                if (i == ara.length - 1) {
                    System.out.print(tmp1.reverse().toString());
                    break;
                }

                tmp1.reverse().toString();
                System.out.print(tmp1 + " ");
            }
            System.out.println();

        }

    }
}
