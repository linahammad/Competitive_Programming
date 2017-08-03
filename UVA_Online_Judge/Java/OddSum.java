/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oddsum;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author linah
 * UVA
 * ID: 10783
 */
public class OddSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(br);

        int testCases = sc.nextInt();
        int startNum, endNum, sumOfOdds;

        for (int tc = 1; tc <= testCases; tc++) {

            startNum = sc.nextInt();
            endNum = sc.nextInt();

            if (startNum % 2 == 0) {
                startNum += 1;
            }

            sumOfOdds = 0;
            for (int n = startNum; n <= endNum; n += 2) {
                sumOfOdds += n;
            }
            System.out.printf("Case %d: %d\n", tc, sumOfOdds);

        }

        System.out.flush();
        sc.close();
        sc = null;
    }

}
