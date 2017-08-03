/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aspecialhappybirthdaysong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author linah 
 * UVA 
 * ID: 12554
 */
public class ASpecialHappyBirthdaySong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] song = {"Happy", "birthday", "to", "you",
            "Happy", "birthday", "to", "you",
            "Happy", "birthday", "to", "Rujia",
            "Happy", "birthday", "to", "you"};
        int n = Integer.parseInt(bf.readLine());
        String[] p = new String[n];
        for (int i = 0; i < n; i++) {
            p[i] = bf.readLine();
        }
        int r = 1;
        if (n > 16) {
            r = (int) Math.ceil(n / 16) + 1;
        }
        for (int i = 0, j = 0, k = 0; i < r * 16; i++, j++, k++) {
            if (k == 16) {
                k = 0;
            }
            if (j == n) {
                j = 0;
            }
            System.out.println(p[j] + ": " + song[k]);
        }
    }
}
