
package horror.dash;

import java.util.Scanner;

/**
 *
 * @author linah 
 * UVA 
 * ID: 11799
 */
public class HorrorDash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        for (int i = 1; i <= cases; i++) {
            int max = 0;
            int num = in.nextInt();
            int arr[] = new int[num];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = in.nextInt();
                if (max < arr[j]) {
                    max = arr[j];
                }
            }
            System.out.println("Case " + i + ": " + max);

        }
    }

}
