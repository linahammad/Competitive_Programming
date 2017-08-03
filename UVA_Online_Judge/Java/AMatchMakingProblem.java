package a.match.making.problem;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author linah 
 * UVA 
 * ID: 12210
 */
public class AMatchMakingProblem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int counter = 1;
        while (true) {
            int m = in.nextInt(), w = in.nextInt();
            if (m == 0 && w == 0) {
                break;
            }

            int m1[] = new int[m], w1[] = new int[w];
            for (int i = 0; i < m1.length; i++) {
                m1[i] = in.nextInt();
            }
            for (int i = 0; i < w1.length; i++) {
                w1[i] = in.nextInt();
            }

            Arrays.sort(m1);
            Arrays.sort(w1);

            if (m1.length == w1.length || m1.length < w1.length) {
                System.out.println("Case " + counter + ": 0");
                counter++;
            } else {
                System.out.println("Case " + counter + ": " + (m1.length - w1.length) + " " + m1[0]);
                counter++;

            }
        }

    }

}
