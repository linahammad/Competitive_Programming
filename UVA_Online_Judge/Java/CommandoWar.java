/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commando.war;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author linah 
 * UVA 
 * ID: 11729
 */
public class CommandoWar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int j = 0, b = 0, x = 0, z, fast, ctr = 0, sCtr = 0, i = 0;
        Scanner in = new Scanner(System.in);
        ArrayList warOutput = new ArrayList();
        int num_of_solidars = in.nextInt();

        do {
            z = i = 0;
            fast = 10000;
            num_of_solidars = in.nextInt();
            sCtr = num_of_solidars;
            while (sCtr != 0) {
                //input briefing and job speed
                b = in.nextInt();
                j = in.nextInt();
                z = z + b;
                if (j < fast) {
                    fast = j;
                } else {
                    fast = fast;
                }
                i++;
                sCtr--;
            }
            warOutput.add(z + fast);
            ctr++;

            if (num_of_solidars == 0) {
                ctr--;
            }
        } while (num_of_solidars != 0);

        for (i = 0; i < ctr; i++) {
            System.out.println("Case " + (i + 1) + ":" + warOutput.get(i));//output cases
        }

    }

}
