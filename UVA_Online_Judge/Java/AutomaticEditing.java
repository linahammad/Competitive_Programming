/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatic.editing;

import java.util.Scanner;

/**
 *
 * @author linah 
 * UVA 
 * ID: 10115
 */
public class AutomaticEditing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            int num_of_rules = in.nextInt();
            if (num_of_rules == 0) {
                break;
            }
            in.nextLine();
            String arr[][] = new String[num_of_rules][2];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < 2; j++) {
                    arr[i][j] = in.nextLine();
                }
            }

            String str = in.nextLine();
            for (int i = 0; i < arr.length; i++) {
                while (str.contains(arr[i][0])) {
                    str = str.replace(arr[i][0], arr[i][1]);

                }
            }

            System.out.println(str);

        }
    }

}
