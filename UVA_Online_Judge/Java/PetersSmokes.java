/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peterssmokes;

import java.util.Scanner;

/**
 *
 * @author linah
 * UVA
 * ID: 10346
 */
public class PetersSmokes {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder output = new StringBuilder();
        while (in.hasNext()) {
            int n = in.nextInt(), k = in.nextInt();
            int total = n;
            int r = n;
            while (r > k) {
                n = r;
                r = r / k;
                total += r;
                r = r + (n - r * k);
            }
            if (r == k) {
                total++;
            }
            output.append(total).append("\n");
        }
        System.out.print(output.toString());
    }

}
