/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egypt;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author linah
 * UVA
 * ID: 11854
 */
public class Egypt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        StringBuilder ans = new StringBuilder();
        int[] lengths = new int[3];
        while (in.hasNext()) {
            lengths[0] = in.nextInt();
            lengths[1] = in.nextInt();
            lengths[2] = in.nextInt();
            if (lengths[0] == 0 && lengths[1] == 0 && lengths[2] == 0) {
                break;
            }
            Arrays.sort(lengths);
            if ((lengths[0] * lengths[0]) + (lengths[1] * lengths[1]) == (lengths[2] * lengths[2])) {
                ans.append("right\n");
            } else {
                ans.append("wrong\n");
            }
        }
        System.out.print(ans.toString());

    }

}
