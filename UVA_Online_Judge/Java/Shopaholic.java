package shopaholic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author linah 
 * UVA 
 * ID: 11369
 */
public class Shopaholic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        Reader.init(System.in);
        int cases = Reader.nextInt();
        for (int i = 0; i < cases; i++) {
            int num = Reader.nextInt();
            int[] A = new int[num];
            for (int j = 0; j < num; j++) {
                A[j] = Reader.nextInt();
            }
            Arrays.sort(A);
            int sum = 0;
            int counter = 0;
            for (int k = num - 1; k >= 0; k--) {
                counter++;
                if (counter == 3) {
                    sum += A[k];
                    counter = 0;
                }
            }
            System.out.println(sum);

        }
    }
}

class Reader {

    static BufferedReader reader;
    static StringTokenizer tokenizer;

    static void init(InputStream input) {
        reader = new BufferedReader(
                new InputStreamReader(input));
        tokenizer = new StringTokenizer("");
    }

    static String next() throws IOException {
        while (!tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(
                    reader.readLine());
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }
}
