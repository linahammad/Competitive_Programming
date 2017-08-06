/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evenodds;

import java.util.Scanner;

/**
 *
 * @author linah
 * CodeForces
 * ID: 318A
 */
public class EvenOdds {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        long n = in.nextLong(), k = in.nextLong();
        n = (n / 2) + (n % 2);
        if (k > n) {
            k -= n;
            System.out.println(k * 2);
        } else {
            System.out.println(k * 2 - 1);
        }
    }

}
