
package flip.sort;

import java.util.Scanner;

/**
 *
 * @author linah 
 * UVA 
 * ID: 10327
 */
public class FlipSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int num = in.nextInt();
            int arr[] = new int[num];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();
            }
            int count = 0, swap;
            for (int i = 0; i < (arr.length - 1); i++) {
                for (int j = 0; j < (arr.length - i - 1); j++) {
                    if (arr[j] > arr[j + 1]) {
                        count++;
                        swap = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = swap;
                    }
                }

            }

            System.out.println("Minimum exchange operations : " + count);

        }
    }

}
