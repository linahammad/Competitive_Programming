/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursescheduling;

import java.util.Scanner;

/**
 *
 * @author linah
 * A2 Online Judge
 * ID: 325
 */
public class CourseScheduling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();

        for (int i = 1; i <= cases; i++) {
            int count = 0;
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            int r = num1 / 2;
            for (int j = 1; j <= num2; j++) {
                int y = in.nextInt();
                if (y > r) {
                    count++;
                }
            }
            System.out.println("Case " + i + ": " + count);

        }
    }

}
