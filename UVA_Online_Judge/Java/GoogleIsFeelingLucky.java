
package google.is.feeling.lucky;

import java.util.Scanner;

/**
 *
 * @author linah 
 * UVA 
 * ID: 12015
 */
public class GoogleIsFeelingLucky {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String arr1[] = new String[10];
        int arr2[] = new int[10];

        int cases = in.nextInt();
        for (int j = 1; j <= cases; j++) {
            int max = 0;
            for (int i = 0; i < 10; i++) {
                arr1[i] = in.next();
                arr2[i] = in.nextInt();
                if (max < arr2[i]) {
                    max = arr2[i];
                }
            }
            System.out.print("Case #" + j + ":\n");
            for (int i = 0; i < 10; i++) {
                if (arr2[i] == max) {
                    System.out.println(arr1[i]);
                }
            }

        }
    }
}
