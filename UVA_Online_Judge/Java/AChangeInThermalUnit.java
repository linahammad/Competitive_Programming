/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package achangeinthermalunit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author linah 
 * UVA
 * ID: 11984
 */
public class AChangeInThermalUnit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        for (int i = 1; i <= t; i++) {
            String l[] = bf.readLine().split(" ");
            int cc = Integer.parseInt(l[0]);
            int d = Integer.parseInt(l[1]);
            double f = (9.0 / 5.0) * cc + 32;
            double c = (f + d - 32) * (5.0 / 9.0);
            System.out.printf("Case %d: %.2f\n", i, c);

        }
    }
}
