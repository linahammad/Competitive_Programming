package the.book.thief;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author linah 
 * UVA 
 * ID: 12908
 */
public class TheBookThief {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int num, n, k;
        StringBuffer out = new StringBuffer();
        while (!(str = in.readLine()).equals("0")) {
            num = Integer.parseInt(str);
            n = (int) Math.sqrt(2 * num);
            k = n * (n + 1) / 2;
            if (k <= num) {
                k += (n++ + 1);
            }
            out.append(k - num).append(" ").append(n).append("\n");

        }
        System.out.print(out);
    }
}
