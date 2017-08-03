package summing.digits;

import java.util.Scanner;

/**
 *
 * @author linah 
 * UVA 
 * ID: 11332
 */
public class SummingDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();

        while (true) {
            int n = in.nextInt();
            String s = "" + n;

            if (n == 0) {
                break;
            } else {

                while (true) {
                    int sum = 0;

                    if (s.length() == 1) {
                        sb2.append(s + "\n");
                        break;
                    } else {
                        char ch[] = s.toCharArray();
                        for (int i = 0; i < ch.length; i++) {
                            sb.append(ch[i]);
                            sum = sum + Integer.parseInt(sb.toString());
                            sb.deleteCharAt(0);
                            s = "" + sum;
                            if (s.length() > 1) {
                                continue;
                            }

                        }
                    }
                }
            }
        }
        System.out.print(sb2);
    }
}
