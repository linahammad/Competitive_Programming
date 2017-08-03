/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relationaloperator;

import java.util.Scanner;

/**
 *
 * @author linah
 * UVA
 * ID: 11172
 */
public class RelationalOperator {

    static int testCases;
    static int a, b;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        testCases = scanner.nextInt();
        for (int i = 0; i < testCases; i++) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            if (a > b) {
                System.out.println(">");
            } else if (a < b) {
                System.out.println("<");
            } else {
                System.out.println("=");
            }
        }
        scanner.close();
    }

}
