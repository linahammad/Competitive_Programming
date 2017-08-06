/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vanyaandcubes;

import java.util.Scanner;

/**
 *
 * @author linah 
 * CodeForces
 * ID: 492A 
 */
public class VanyaAndCubes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String s = input.next();
        int cubes = Integer.parseInt(s);
        int count = 0;
        if (cubes == 1) {

            count++;

        }

        for (int i = 1; i < cubes; i++) {
            int level = i * (i + 1) / 2;
            if (cubes >= level) {
                cubes -= level;
                count++;
            }
        }

        System.out.println(count);
    }

}
