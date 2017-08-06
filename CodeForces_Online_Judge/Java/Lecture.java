/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture;

import java.util.Scanner;

/**
 *
 * @author linah 
 * CodeForces
 * ID: 499B
 */
public class Lecture {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        String arr1[][] = new String[m][2];
        String arr2[] = new String[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < 2; j++) {
                arr1[i][j] = in.next();
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = in.next();
        }

        String out = "";
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i].equals(arr1[j][0]) || arr2[i].equals(arr1[j][1])) {
                    if (arr1[j][0].length() > arr1[j][1].length()) {
                        out = out + arr1[j][1] + " ";
                    } else if (arr1[j][0].length() < arr1[j][1].length() || arr1[j][0].length() == arr1[j][1].length()) {
                        out = out + arr1[j][0] + " ";
                    }
                }
            }
        }

        System.out.println(out);

    }

}
