/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ramitheaccountant;

import java.util.Scanner;

/**
 *
 * @author linah
 * A2 Online Judge
 * ID: 180
 */
public class RamiTheAccountant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        for (int i = 1; i <= cases; i++) {
            String name = in.next();
            int amount = in.nextInt();
            int num_of_transactions = in.nextInt();
            for (int k = 0; k < num_of_transactions; k++) {
                String transactions = in.next();
                int n = in.nextInt();
                if (transactions.equals("buy")) {
                    amount = amount - n;
                } else {
                    amount = amount + n;
                }
            }
            System.out.println(name + " " + amount);

        }
    }

}
