package ones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author linah
 * UVA 
 * ID: 10127
 * 
 */
public class Ones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader b
                = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = b.readLine()) != null) {
            int numof1 = 1;
            int t = 1;
            int n = Integer.parseInt(s);
            while (t != 0) {
                if (n > t) {
                    numof1++;
                    t = t * 10 + 1;
                } else {
                    t = t % n;
                }
            }
            System.out.println(numof1);
        }
    }

}
