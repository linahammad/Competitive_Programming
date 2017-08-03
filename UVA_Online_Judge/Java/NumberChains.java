/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberchains;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * @author linah
 * UVA
 * ID: 263
 */
public class NumberChains {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int n = Integer.parseInt(scan.readLine());

            if (n == 0) {
                break;
            }

            int[] p = new int[1005];
            int pn = 1;
            p[0] = n;

            System.out.println("Original number was " + n);

            while (true) {
                String str = n + "";

                int[] tmp = new int[str.length()];

                for (int i = 0; i < tmp.length; i++) {
                    tmp[i] = str.charAt(i) - '0';
                }

                Arrays.sort(tmp);

                int ia = 0;
                int ib = 0;

                for (int i = 0; i < tmp.length; i++) {
                    ia = (ia * 10) + tmp[i];
                    ib = ib + tmp[i] * (int) Math.pow(10, i);
                }

                n = ib - ia;
                System.out.println(ib + " - " + ia + " = " + n);

                boolean found = false;
                for (int i = 0; i < pn; i++) {
                    if (p[i] == n) {
                        found = true;
                    }
                }

                if (!found) {
                    p[pn++] = n;
                } else {
                    System.out.println("Chain length " + pn);
                    System.out.println();
                    break;
                }
            }
        }
    }
}
