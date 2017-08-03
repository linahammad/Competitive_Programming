package ecologicalpremium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author linah
 * UVA
 * ID: 10300
 */
public class EcologicalPremium {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int noOfCases = Integer.parseInt(bf.readLine());
        int noOfFarmers;
        long size;
        long degree;
        long sum;
        while ((noOfCases--) > 0) {
            sum = 0;
            noOfFarmers = Integer.parseInt((bf.readLine()));
            while ((noOfFarmers--) > 0) {
                String s[] = bf.readLine().split(" ");
                size = Long.parseLong(s[0]);

                degree = Long.parseLong(s[2]);
                sum += size * degree;
            }
            System.out.println(sum);
        }
    }
}
