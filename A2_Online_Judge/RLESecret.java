/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rlesecret;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author linah A2 
 * Online Judge 
 * ID: 139 
 * 
 */
public class RLESecret {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        in.nextLine();
        for (int o = 0; o < cases; o++) {
            String str = in.next();
            char arr[] = str.toCharArray();
            int count = 0;
            int k = 0;

            for (int i = 0; i < arr.length;) {
                if (arr[k] == arr[i]) {
                    count++;
                    i++;
                } else {

                    System.out.print(arr[k] + "" + count);
                    arr = Arrays.copyOfRange(arr, count, arr.length);
                    count = 0;
                    i = 0;
                }
            }

            System.out.print(arr[k] + "" + arr.length);

            System.out.println();

        }
    }

}
