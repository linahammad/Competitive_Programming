/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package omar;

import java.util.Scanner;

/**
 *
 * @author linah
 * A2 Online Judge
 * ID: 1
 */
public class Omar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        for (int i = 0; i < cases; i++) {
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            System.out.println(num1 + num2);

        }
    }

}
