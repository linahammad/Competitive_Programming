package the.bus.driver.problem;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author linah 
 * UVA 
 * ID: 11389
 */
public class TheBusDriverProblem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {

            int n = in.nextInt();
            int d = in.nextInt();
            int r = in.nextInt();
            if (n == 0 && d == 0 && r == 0) {
                break;
            }
            int[] morning = new int[n];
            int[] evening = new int[n];
            for (int i = 0; i < evening.length; i++) {
                morning[i] = in.nextInt();
            }
            for (int i = 0; i < evening.length; i++) {
                evening[i] = in.nextInt();
            }

            Arrays.sort(morning);
            Arrays.sort(evening);
            int sum = 0;
            for (int i = 0; i < evening.length; i++) {
                int temp = morning[i] + evening[evening.length - 1 - i] - d;
                if (temp > 0) {
                    sum += temp * r;
                }
            }
            System.out.println(sum);
        }
    }

}
