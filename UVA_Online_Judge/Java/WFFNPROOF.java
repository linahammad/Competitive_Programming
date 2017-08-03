
package wff.n.proof;

import java.util.Scanner;

/**
 *
 * @author linah 
 * UVA 
 * ID: 11103
 */
public class WFFNPROOF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            char[] s = in.nextLine().toCharArray();
            if (s.length == 1 && s[0] == '0') {
                break;
            }
            String res = "";

            int cnt = 0;
            for (int i = 0; i < s.length; i++) {
                if (Character.isLowerCase(s[i])) {
                    res = s[i] + res;
                    s[i] = 0;
                    cnt++;
                    break;
                }
            }
            for (int i = 0; i < s.length; i++) {
                if (s[i] == 'N') {
                    res = 'N' + res;
                    s[i] = 0;
                }
            }
            while (true) {
                boolean flag = true;

                for (int i = 0; i < s.length; i++) {
                    if (Character.isLowerCase(s[i]) && cnt < 2) {
                        res = s[i] + res;
                        s[i] = 0;
                        cnt++;
                        flag = false;
                    } else if (Character.isUpperCase(s[i])) {
                        if (s[i] == 'N' && cnt == 1) {
                            res = s[i] + res;
                            s[i] = 0;
                            flag = false;
                        } else if (cnt == 2 && s[i] != 'N') {
                            res = s[i] + res;
                            s[i] = 0;
                            flag = false;
                            cnt = 1;
                        }
                    }
                }
                if (flag) {
                    break;
                }
            }
            if (cnt == 2) {
                System.out.println(res.substring(1, res.length()));
            } else if (res.length() > 0 && cnt == 1) {
                System.out.println(res);
            } else {
                System.out.println("no WFF possible");
            }
        }
    }

}
