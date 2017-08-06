/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crazytown;

import java.util.Scanner;

/**
 *
 * @author linah
 * 
 * CodeForces 
 * ID: 498A
 */
public class CrazyTown {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long x1 = in.nextInt(), y1 = in.nextInt();
        long x2 = in.nextInt(), y2 = in.nextInt();
        long num_of_road = in.nextInt();
        long ai, bi, ci, r1, r2, min_road = 0;
        for (int i = 0; i < num_of_road; i++) {
            ai = in.nextInt();
            bi = in.nextInt();
            ci = in.nextInt();
            r1 = ai * x1 + bi * y1 + ci;
            r2 = ai * x2 + bi * y2 + ci;
            if ((r1 > 0 && r2 < 0) || (r1 < 0 && r2 > 0)) {
                min_road++;
            }
        }
        System.out.println(min_road);

    }

}
