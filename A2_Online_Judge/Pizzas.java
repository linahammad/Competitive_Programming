/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzas;

import java.util.Scanner;

/**
 *
 * @author linah
 * A2 Online Judge
 * ID: 326
 */
public class Pizzas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        StringBuffer sb = new StringBuffer();

        for (int i = 1; i <= cases; i++) {
            int num = in.nextInt();
            int p, sum = 0;
            for (int j = 0; j < num; j++) {
                p = in.nextInt();
                sum = sum + p;
            }

            sb.append("Case " + i + ": " + sum + "\n");

        }

        System.out.print(sb);
    }

}
