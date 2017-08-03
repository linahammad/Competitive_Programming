package foreign.exchange;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author linah 
 * UVA 
 * ID: 10763
 */
public class ForeignExchange {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            int num = in.nextInt();
            if (num == 0) {
                break;
            }
            int arr1[] = new int[num];
            int arr2[] = new int[num];

            for (int i = 0; i < num; i++) {
                arr1[i] = in.nextInt();
                arr2[i] = in.nextInt();
            }

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            boolean bool = true;

            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] != arr2[j]) {
                    bool = false;
                    break;
                }

            }

            if (bool) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }

}
