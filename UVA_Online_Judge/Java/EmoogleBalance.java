package emooglebalance;

import java.util.Scanner;

/**
 *
 * @author linah
 * UVA
 * ID: 12279 
 */
public class EmoogleBalance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentCase = 1;
        int noOfCases;
        int currentVal;
        int total;
        noOfCases = scanner.nextInt();
        while (noOfCases != 0) {
            total = 0;
            for (int i = 0; i < noOfCases; i++) {
                currentVal = scanner.nextInt();
                if (currentVal == 0) {
                    total--;
                } else {
                    total++;
                }
            }
            System.out.println("Case " + currentCase + ": " + total);
            noOfCases = scanner.nextInt();
            currentCase++;
        }
    }
}
