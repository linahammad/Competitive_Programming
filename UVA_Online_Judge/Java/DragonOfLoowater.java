
package dragon.of.loowater;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author linah 
 * UVA 
 * ID: 11292 
 */
public class DragonOfLoowater {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int numh = in.nextInt();
            int numk = in.nextInt();
            if (numh == 0 && numk == 0) {
                break;
            }
            int[] h = new int[numh];
            int[] k = new int[numk];
            for (int i = 0; i < numh; i++) {
                h[i] = in.nextInt();
            }
            for (int i = 0; i < numk; i++) {
                k[i] = in.nextInt();
            }

            Arrays.sort(h);
            Arrays.sort(k);

            int c = 0;
            int sum = 0;

            for (int i = 0; i < numh; i++) {
                if (numh - i > numk - c) {
                    sum = 0;

                    break;
                }

                for (int j = c; j < numk; j++) {
                    if (k[j] < h[i]) {
                        c++;
                        continue;
                    }
                    sum += k[j];
                    c++;

                    break;
                }
            }
            if (sum == 0) {
                System.out.println("Loowater is doomed!");
            } else {
                System.out.println(sum);
            }
        }
    }

}
