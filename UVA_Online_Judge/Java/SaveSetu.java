/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savesetu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author linah
 * UVA
 * ID: 12403 
 */
public class SaveSetu {

    public static void main(String[] abc) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCaseCount = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int testCase = 0; testCase < testCaseCount; testCase++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String op = st.nextToken();
            if (op.equals("donate")) {
                sum += Integer.parseInt(st.nextToken());
            } else if (op.equals("report")) {
                System.out.println(sum);
            }
        }
    }
}
