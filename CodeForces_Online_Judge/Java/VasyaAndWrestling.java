/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vasyaandwrestling;

import java.util.Scanner;

/**
 *
 * @author linah 
 * CodeForces
 * ID: 493B
 */
public class VasyaAndWrestling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        long arr1[] = new long[200000], arr2[] = new long[200000];
        long sum1 = 0, sum2 = 0, x = 0;
        int count1 = 0, count2 = 0, ans = 0, last = 0;
        boolean flag = true;
        for (int i = 0; i < num; i++) {
            x = in.nextLong();
            if (x > 0) {
                arr1[count1++] = x;
                sum1 += x;
                last = 1;
            } else {
                arr2[count2++] = Math.abs(x);
                sum2 += Math.abs(x);
                last = 2;
            }
        }
        if (sum1 > sum2) {
            System.out.println("first");
        } else if (sum2 > sum1) {
            System.out.println("second");
        } else {
            for (int i = 0; i < num; i++) {
                if (arr1[i] != arr2[i]) {
                    flag = false;
                }
            }
            if (flag) {
                if (last == 1) {
                    System.out.println("first");
                } else {
                    System.out.println("second");
                }
            }
            for (int i = 0; i < num; i++) {
                if (arr1[i] > arr2[i]) {
                    ans = 1;
                    break;
                } else if (arr2[i] > arr1[i]) {
                    ans = 2;
                    break;
                }
            }
            if (ans == 1) {
                System.out.println("first");
            } else if (ans == 2) {
                System.out.println("second");
            }
        }
    }

}
