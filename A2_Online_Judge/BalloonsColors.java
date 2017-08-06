/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balloonscolors;

import java.util.Scanner;

/**
 *
 * @author linah
 * A2 Online Judge
 * ID: 6
 */
public class BalloonsColors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //enter number of cases
        int cases = in.nextInt();

        for (int t = 0; t < cases; t++) {
            int number = in.nextInt(), x = in.nextInt(), y = in.nextInt();
            int arr[] = new int[number];
            for (int i = 0; i < number; i++) {
                arr[i] = in.nextInt();
            }
            if (arr[0] == x && arr[number - 1] == y) {
                System.out.println("BOTH");
            } else if (arr[0] == x && arr[number - 1] != y) {
                System.out.println("EASY");
            } else if (arr[0] != x && arr[number - 1] == y) {
                System.out.println("HARD");
            } else {
                System.out.println("OKAY");
            }

        }
    }

}
