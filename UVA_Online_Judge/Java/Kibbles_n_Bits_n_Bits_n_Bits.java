
package kibbles_n_.bits_n_.bits_n_.bits;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author linah 
 * UVA 
 * ID: 446
 */
public class Kibbles_n_Bits_n_Bits_n_Bits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        for (int i = 0; i < cases; i++) {
            BigInteger h1 = new BigInteger(in.next(), 16);
            String op = in.next();
            BigInteger h2 = new BigInteger(in.next(), 16);

            String str1 = "", str2 = "";
            int len1, len2;

            len1 = h1.toString(2).length();
            len2 = h2.toString(2).length();
            while (len1 < 13) {
                str1 = "0" + str1;
                len1++;
            }
            while (len2 < 13) {
                str2 = "0" + str2;
                len2++;
            }

            if (op.equals("+")) {
                System.out.println(str1 + h1.toString(2) + " " + op + " " + str2 + h2.toString(2) + " = " + (h1.add(h2)).toString(10));

            } else {
                System.out.println(str1 + h1.toString(2) + " " + op + " " + str2 + h2.toString(2) + " = " + (h1.subtract(h2)).toString(10));
            }

        }

    }

}
