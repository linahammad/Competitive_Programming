
package bigchocolate;

import java.util.Scanner;

/**
 *
 * @author linah
 */
public class BigChocolate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNextInt()) {
            int M = input.nextInt();
            int N = input.nextInt();
            int res = M * N - 1;
            System.out.println(res);
        }
    }

}
