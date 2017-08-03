/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perfect.choir;

import java.util.Scanner;

/**
 *
 * @author linah 
 * UVA 
 * ID: 12485
 */
public class PerfectChoir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int num = in.nextInt();
            int arr[] = new int[num];
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();
                sum += arr[i];
            }

            if (sum % num != 0) {
                System.out.println("-1");
            } else {
                sum /= num;
                int count = 1;
                for (int level = 0; arr[level] < sum; level++) {
                    count += (sum - arr[level]);
                }
                System.out.println(count);

            }
        }

    }
}
