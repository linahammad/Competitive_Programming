/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secretresearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author linah 
 * UVA 
 * ID: 621
 */
public class SecretResearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        StringBuffer sb = new StringBuffer("");
        String m = "";
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            m = br.readLine();
            int last = m.length() - 1;
            if ("1".equals(m) || "4".equals(m) || "78".equals(m)) {
                sb.append("+").append("\n");
            } else if (m.charAt(last - 1) == '3' && m.charAt(last) == '5') {
                sb.append("-").append("\n");
            } else if (m.charAt(0) == '9' && m.charAt(last) == '4') {
                sb.append("*").append("\n");
            } else if (m.charAt(0) == '1' && m.charAt(1) == '9' && m.charAt(2) == '0') {
                sb.append("?").append("\n");
            }
        }
        System.out.print(sb);
    }

}
