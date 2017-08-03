package numeric.center;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author linah 
 * UVA 
 * ID: 12909
 */
public class NumericCenter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);

        BigInteger arr[] = {new BigInteger("0"), new BigInteger("8"), new BigInteger("49"), new BigInteger("288"), new BigInteger("1681"),
            new BigInteger("9800"), new BigInteger("57121"), new BigInteger("332928"), new BigInteger("1940449"),
            new BigInteger("11309768"), new BigInteger("65918161"), new BigInteger("384199200"), new BigInteger("2239277041"),
            new BigInteger("13051463048"), new BigInteger("76069501249"), new BigInteger("443365544448"), new BigInteger("2584123765441"),
            new BigInteger("15061377048200"), new BigInteger("87784138523761")};

        while (true) {
            BigInteger num = in.nextBigInteger();
            if (num.compareTo(BigInteger.ZERO) == 0) {
                break;
            }
            for (int i = 18; i >= 0; i--) {
                if (num.compareTo(arr[i]) >= 0) {
                    System.out.println(i);
                    break;
                }
            }
        }

    }

}
