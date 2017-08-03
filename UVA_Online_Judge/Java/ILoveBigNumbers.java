
package i.love.big.numbers;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author linah 
 * UVA 
 * ID: 10220
 */
public class ILoveBigNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();

        while (in.hasNextLine()) {
            try {
                int n = in.nextInt();
                BigInteger f = BigInteger.ONE;
                BigInteger sum = BigInteger.ZERO;

                for (int i = 1; i <= n; i++) {
                    f = (f.multiply(BigInteger.valueOf(i)));
                }

                String s = "" + f;
                char ch[] = s.toCharArray();
                for (int i = 0; i < ch.length; i++) {
                    sb.append(ch[i]);
                    sum = sum.add(BigInteger.valueOf(Integer.parseInt(sb.toString())));
                    sb.deleteCharAt(0);
                    s = "" + sum;
                }

                sb2.append(sum + "\n");
            } catch (Exception e) {
                break;
            }

        }

        System.out.print(sb2);

    }

}
