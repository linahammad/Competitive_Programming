/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leapyearornotleapyear;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import static java.math.BigInteger.*;

/**
 *
 * @author linah 
 * UVA 
 * ID: 10070
 */
public class LeapYearOrNotLeapYear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BigInteger year;
        int chec = 0;
        String s;
        while ((s = bf.readLine()) != null) {
            year = new BigInteger(s);
            if (chec != 0) {
                System.out.println();
            }
            chec = 1;
            if ((year.mod(valueOf(400)).equals(ZERO))
                    || ((year.mod(valueOf(4)).equals(ZERO))
                    && !(year.mod(valueOf(100)).equals(ZERO)))) {
                System.out.println("This is leap year.");
                if (year.mod(valueOf(15)).equals(ZERO)) {
                    System.out.println("This is huluculu festival year.");
                }
                if (year.mod(valueOf(55)).equals(ZERO)) {
                    System.out.println("This is bulukulu festival year.");
                }
            } else if (year.mod(valueOf(15)).equals(ZERO)) {
                System.out.println("This is huluculu festival year.");
            } else {
                System.out.println("This is an ordinary year.");
            }

        }

    }

}
