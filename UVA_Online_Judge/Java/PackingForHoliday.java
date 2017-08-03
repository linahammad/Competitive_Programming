/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packingforholiday;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author linah
 * UVA
 * ID: 12372
 */
public class PackingForHoliday {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCaseCount = Integer.parseInt(br.readLine());
        for (int testCase = 1; testCase <= testCaseCount; testCase++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            boolean good = true;
            while (st.hasMoreTokens() && good) {
                good = (Integer.parseInt(st.nextToken()) <= 20);
            }
            if (good) {
                System.out.println("Case " + testCase + ": good");
            } else {
                System.out.println("Case " + testCase + ": bad");
            }
        }
    }
}
