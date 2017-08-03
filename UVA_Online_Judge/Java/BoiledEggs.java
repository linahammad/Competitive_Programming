package boiled.eggs;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author linah 
 * UVA 
 * ID: 11900
 */
public class BoiledEggs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        for (int o = 1; o <= cases; o++) {
            int n = in.nextInt(), p = in.nextInt(), q = in.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();
            }
            Arrays.sort(arr);

            int sum = 0;
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
                if (sum > q || count >= p) {
                    break;
                }
                count++;
            }
            System.out.println("Case " + o + ": " + count);
        }
    }

}
