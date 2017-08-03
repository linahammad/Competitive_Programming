package jollyjumpers;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author linah 
 * UVA
 * ID: 10038
 */
public class JollyJumpers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int a, b = 0;
            ArrayList result = new ArrayList<Integer>();

            for (int i = 0; i < n; i++) {

                arr[i] = sc.nextInt();
            }
            boolean f = true;
            for (int y = 0; y < arr.length - 1; y++) {

                a = arr[y] - arr[y + 1];
                b = Math.abs(a);
                if (b == 0) {
                    f = false;
                    System.out.println("Not jolly");
                    break;
                }
                if (b >= arr.length) {
                    f = false;
                    System.out.println("Not jolly");
                    break;
                }

                if (result.contains(b)) {
                    f = false;
                    System.out.println("Not jolly");
                    break;
                }

                result.add(b);

            }
            if (f) {
                System.out.println("Jolly");
            }
        }

    }
}
