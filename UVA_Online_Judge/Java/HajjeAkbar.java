/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hajjeakbar;

import java.util.Scanner;

/**
 *
 * @author linah
 * UVA
 * ID: 12577
 */
public class HajjeAkbar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line;
        int t = 1;
        while (!(line = in.nextLine()).equals("*")) {
            if (line.equals("Hajj")) {
                System.out.println(String.format("Case %d: Hajj-e-Akbar", t++));
            } else {
                System.out.println(String.format("Case %d: Hajj-e-Asghar", t++));
            }
        }
        in.close();
    }

}
