package wertyu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author linah 
 * UVA
 * ID: 10082
 */
public class WERTYU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        char[] c = {'`', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '-', '=',
            'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P', '[', ']',
            'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', ';', '\'', '\\',
            'Z', 'X', 'C', 'V', 'B', 'N', 'M', ',', '.', '/'
        };
        String l = "";
        while ((l = bf.readLine()) != null) {
            for (int i = 0; i < l.length(); i++) {
                if (l.charAt(i) != ' ') {
                    for (int j = 1; j < c.length; j++) {
                        if (l.charAt(i) == c[j]) {
                            System.out.print(c[j - 1]);
                        }
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
