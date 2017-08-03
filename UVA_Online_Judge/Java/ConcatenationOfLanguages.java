
package concatenation.of.languages;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author linah 
 * UVA 
 * ID: 10887
 */
public class ConcatenationOfLanguages {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        for (int i = 1; i <= cases; i++) {
            int n1 = in.nextInt();
            int n2 = in.nextInt();
            in.nextLine();

            String a[] = new String[n1];
            String aa[] = new String[n2];
            for (int j = 0; j < a.length; j++) {
                a[j] = in.nextLine();
            }
            for (int j = 0; j < aa.length; j++) {
                aa[j] = in.nextLine();
            }

            Set<String> set = new HashSet<String>();
            for (int j = 0; j < a.length; j++) {
                for (int k = 0; k < aa.length; k++) {
                    set.add(a[j] + aa[k]);
                }
            }

            System.out.println("Case " + i + ": " + set.size());

        }

    }
}
