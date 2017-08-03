/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoemaker.s.problem;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author linah 
 * UVA 
 * ID: 10026
 */
public class ShoemakerSProblem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        for (int y = 0; y < cases; y++) {
            int num = in.nextInt();
            double arr1[] = new double[num];
            double arr2[] = new double[num];
            for (int i = 0; i < num; i++) {
                arr1[i] = in.nextInt();
                arr2[i] = in.nextInt();
            }
            double ans[][] = new double[num][2];
            double b[] = new double[num];
            for (int i = 0; i < num; i++) {
                ans[i][0] = i + 1;
                ans[i][1] = arr2[i] / arr1[i];
                b[i] = ans[i][1];
            }
            Arrays.sort(b);

            for (int i = num - 1; i >= 0; i--) {
                for (int j = 0; j < num; j++) {
                    if (b[i] == ans[j][1] && i != 0) {
                        System.out.print((int) ans[j][0] + " ");
                        ans[j][1] = -1;
                        break;
                    } else if (b[i] == ans[j][1] && i == 0) {
                        System.out.print((int) ans[j][0]);
                        ans[j][1] = -1;
                        break;
                    }
                }

            }
            if (y != cases - 1) {
                System.out.println("\n");
            } else {
                System.out.println();
            }

        }

    }
}
