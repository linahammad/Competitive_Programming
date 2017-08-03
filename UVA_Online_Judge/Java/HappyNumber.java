
package happy.number;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author linah 
 * UVA 
 * ID: 10591
 */
public class HappyNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        int cases = in.nextInt();
        for (int i1 = 1; i1 <= cases; i1++) {

            int n = in.nextInt();
            String s = "" + n;
            while (true) {
                int sum = 0;
                char ch[] = s.toCharArray();
                for (int i = 0; i < ch.length; i++) {
                    sb.append(ch[i]);
                    sum = sum + (int) Math.pow(Integer.parseInt(sb.toString()), 2);
                    sb.deleteCharAt(0);
                }
                if (sum == 1) {
                    sb2.append("Case #" + i1 + ": " + n + " is a Happy number.\n");
                    break;
                } else {
                    s = "" + sum;
                    if (s.length() == 1) {
                        sb2.append("Case #" + i1 + ": " + +n + " is an Unhappy number.\n");
                        break;
                    } else {
                        s = "" + sum;
                    }

                }
            }

        }

        System.out.print(sb2);
    }
}
