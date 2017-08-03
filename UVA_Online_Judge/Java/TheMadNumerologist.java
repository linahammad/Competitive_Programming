
package the.mad.numerologist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 *
 * @author linah 
 * UVA 
 * ID: 10785
 */
public class TheMadNumerologist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Reader.init(System.in);
        String vowel = "AUEOI";
        String cos = "JSBKTCLDMVNWFXGPYHQZR";
        String vowels = "";
        String coss = "";
        for (int i = 0; i < vowel.length(); i++) {
            for (int j = 0; j < 21; j++) {
                vowels += vowel.charAt(i);
            }
        }
        for (int i = 0; i < cos.length(); i++) {
            for (int j = 0; j < 5; j++) {
                coss += cos.charAt(i);
            }
        }
        int t = Reader.nextInt();

        int k = 1;

        while (t-- > 0) {
            int n = Reader.nextInt();
            String v = "";

            for (int i = 0; i < (n + 1) / 2; i++) {
                v += vowels.charAt(i);
            }

            String c = "";

            for (int i = 0; i < (n / 2); i++) {
                c += coss.charAt(i);
            }

            char[] vow = v.toCharArray();
            char[] co = c.toCharArray();

            Arrays.sort(vow);
            Arrays.sort(co);

            String S = "";
            boolean s = false;
            for (int i = 0; i < vow.length; i++) {
                S += vow[i];
                if (i < co.length) {
                    S += co[i];

                }

            }

            System.out.println("Case " + (k++) + ": " + S);

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

    static String nextLine() throws IOException {
        return reader.readLine();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }
}
