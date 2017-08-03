/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textquotes;

import java.util.Scanner;

/**
 *
 * @author linah
 * UVA
 * ID: 272
 */
public class TextQuotes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;
        boolean open = true;
        boolean end = false;
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == '\u001a') {
                    end = true;
                    break;
                }
                if (line.charAt(i) == '\"') {
                    if (open == true) {
                        System.out.print("``");
                        open = false;
                        continue;
                    } else {
                        System.out.print("''");
                        open = true;
                        continue;
                    }
                }
                System.out.print(line.charAt(i));
            }
            System.out.print("\n");
        }
    }
}
