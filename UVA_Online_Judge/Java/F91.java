/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package f91;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 *
 * @author linah
 * UVA
 * ID: 10696
 */
public class F91 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int n = 0;
        while ((n = Integer.parseInt(br.readLine())) != 0) {
            int m = n;
            if (n > 100) {
                n -= 10;
            } else {
                n = 91;
            }
            pw.println("f91(" + m + ") = " + n);
        }
        pw.flush();
        pw.close();
    }
}
