/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thebasesareloaded;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author linah
 * UVA
 * ID: 355
 */
public class TheBasesAreLoaded {

    /**
     * @param args
     */
    public static void main(String[] args) {
        boolean truthValue = true;
        int givenBase, convertBase, len;
        StringBuilder str;
        BigInteger convertNumber;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            givenBase = sc.nextInt();
            convertBase = sc.nextInt();
            str = new StringBuilder(sc.nextLine());
            str.deleteCharAt(0);
            len = str.length();

            for (int i = 0; i < len; i++) {
                if (givenBase < 10 && str.charAt(i) >= givenBase + 48) {
                    System.out.println(str + " is an illegal base " + givenBase + " number");
                    truthValue = false;
                    break;
                } else if (givenBase > 9 && str.charAt(i) > givenBase + 'A' - 11) {
                    System.out.println(str + " is an illegal base " + givenBase + " number");
                    truthValue = false;
                    break;
                }
            }
            if (truthValue == true) {
                convertNumber = new BigInteger(str.toString(), givenBase);
                System.out.println(str + " base " + givenBase + " = " + convertNumber.toString(convertBase).toUpperCase() + " base " + convertBase);
            }
            truthValue = true;
        }
    }

}
