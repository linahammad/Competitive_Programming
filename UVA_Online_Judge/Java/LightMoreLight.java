/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lightmorelight;

import java.util.Scanner;

/**
 *
 * @author linah
 * UVA
 * ID: 10110
 */
public class LightMoreLight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long N = -1;
        while ((N = in.nextLong()) != 0) {
            long sq = (long) Math.floor(Math.sqrt(N));
            System.out.println((sq * sq == N) ? "yes" : "no");
        }
    }
}
