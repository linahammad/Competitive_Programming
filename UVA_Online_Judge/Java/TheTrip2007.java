package the.trip.pkg2007;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author linah 
 * UVA 
 * ID: 11100
 */
public class TheTrip2007 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;

        while ((num = in.nextInt()) != 0) {
            int[] arr = new int[num];
            for (int i = 0; i < num; i++) {
                arr[i] = in.nextInt();
            }

            Arrays.sort(arr);

            int ans = 1;
            for (int j = 1, i = 1; i < num; i++) {
                if (arr[i] == arr[i - 1]) {
                    j++;
                } else {
                    j = 1;
                }
                ans = Math.max(ans, j);
            }
            System.out.println(ans);

            for (int i = 0; i < ans; i++) {
                System.out.print(arr[i]);
                for (int j = i + ans; j < num; j += ans) {
                    System.out.print(" " + arr[j]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
