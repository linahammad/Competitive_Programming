/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ternary;

import java.util.Scanner;

/**
 *
 * @author linah
 * UVA
 * ID: 11185
 */
public class Ternary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            long n = in.nextLong();
            if (n < 0) {
                break;
            }
            System.out.println(Long.toString(n, 3));
        }
    }
}
