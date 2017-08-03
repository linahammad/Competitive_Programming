package coin.collector;

import java.util.Scanner;

/**
 *
 * @author linah 
 * UVA 
 * ID: 11264
 */
public class CoinCollector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        for (int y = 0; y < cases; y++) {
            int num = in.nextInt();
            int arr[] = new int[num];
            for (int i = 0; i < num; i++) {
                arr[i] = in.nextInt();
            }
            int sum = 2;
            int sum1 = arr[0];
            for (int i = 1; i < num - 1; i++) {
                int ss = arr[i] + sum1;
                if (ss <= arr[i + 1]) {
                    sum++;
                    sum1 += arr[i];
                }
            }

            System.out.println(sum);
        }
    }

}
