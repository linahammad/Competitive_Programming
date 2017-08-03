
package funny.encryption.method;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author linah 
 * UVA 
 * ID: 10019
 */
public class FunnyEncryptionMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringBuffer sb2 = new StringBuffer();
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        for (int i1 = 0; i1 < cases; i1++) {
            String s = in.next();
            BigInteger d = new BigInteger(s, 10);
            String b = d.toString(2);
            char ch1[] = b.toCharArray();
            int sum1 = 0;
            for (int i = 0; i < ch1.length; i++) {
                if (ch1[i] == '1') {
                    sum1++;
                }
            }
            BigInteger h = new BigInteger(s, 16);
            String b2 = h.toString(2);

            char ch2[] = b2.toCharArray();
            int sum2 = 0;
            for (int i = 0; i < ch2.length; i++) {
                if (ch2[i] == '1') {
                    sum2++;
                }
            }
            sb2.append(sum1 + " " + sum2 + "\n");

        }
        System.out.print(sb2);

    }
}
