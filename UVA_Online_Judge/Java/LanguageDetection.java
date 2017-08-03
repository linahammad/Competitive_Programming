
package languagedetection;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author linah 
 * UVA 
 * ID: 12250
 */
public class LanguageDetection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList Result = new ArrayList();

        for (int j = 0; j < 2000; j++) {
            String Word = input.next();

            if ("#".equals(Word)) {
                break;
            }

            if ("HELLO".equals(Word)) {
                Result.add("ENGLISH");
            }
            if ("HOLA".equals(Word)) {
                Result.add("SPANISH");
            }
            if ("HALLO".equals(Word)) {
                Result.add("GERMAN");
            }
            if ("BONJOUR".equals(Word)) {
                Result.add("FRENCH");
            }
            if ("CIAO".equals(Word)) {
                Result.add("ITALIAN");
            }
            if ("ZDRAVSTVUJTE".equals(Word)) {
                Result.add("RUSSIAN");
            }
            if (!"HELLO".equals(Word) && !"HOLA".equals(Word) && !"HALLO".equals(Word) && !"BONJOUR".equals(Word) && !"CIAO".equals(Word) && !"ZDRAVSTVUJTE".equals(Word)) {
                Result.add("UNKNOWN");
            }

        }
        for (int j = 0; j < Result.size(); j++) {
            System.out.println("Case " + (j + 1) + ": " + Result.get(j));
        }
    }

}
