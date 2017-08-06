/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzacutting;

import java.util.Scanner;

/**
 *
 * @author linah
 * UVA
 * ID: 10079
 */
public class PizzaCutting {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n;
        n = sc.nextLong();
        while (n >= 0) {
            System.out.println(n * (n + 1) / 2 + 1);
            n = sc.nextLong();
        }
    }

}
