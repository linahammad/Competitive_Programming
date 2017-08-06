/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package watchingmovie;

import java.util.Scanner;

/**
 *
 * @author linah
 * CodeForces
 * ID: 499A
 */
public class WatchingMovie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long count = 1, min = 0;
        int n = in.nextInt();
        long x = in.nextInt();
        long m1, m2;
        for (int i = 0; i < n; i++) {
            m1 = in.nextLong();
            m2 = in.nextLong();
            while (count + x <= m1) {
                count += x;
            }

            min = min + m2 - count + 1;
            count = m2 + 1;
        }

        System.out.println(min);

    }

}
