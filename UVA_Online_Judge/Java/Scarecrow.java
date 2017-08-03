/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scarecrow;

import java.util.Scanner;

/**
 *
 * @author linah 
 * UVA 
 * ID: 12405
 */
public class Scarecrow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        for (int i = 1; i <= cases; i++) {
            int count = 0;
            int num = in.nextInt();
            String s = in.next();
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '.') {
                    count++;
                    j += 2;
                }

            }
            System.out.println("Case " + i + ":" + " " + count);

        }

    }

}
