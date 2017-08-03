/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchingfornessy;

import java.util.Scanner;

/**
 *
 * @author linah 
 * UVA
 * ID: 11044
 */
public class SearchingForNessy {

    static int testCases;
    static int val1, val2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        testCases = scanner.nextInt();
        while ((testCases--) != 0) {
            val1 = scanner.nextInt();
            val2 = scanner.nextInt();
            val1 = val1 / 3;
            val2 = val2 / 3;
            System.out.println(val1 * val2);
        }
        scanner.close();
    }
}
