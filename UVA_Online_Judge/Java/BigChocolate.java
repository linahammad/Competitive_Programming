/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigchocolate;

import java.util.Scanner;

/**
 *
 * @author linah
 */
public class BigChocolate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNextInt()) {
            int M = input.nextInt();
            int N = input.nextInt();
            int res = M * N - 1;
            System.out.println(res);
        }
    }

}
