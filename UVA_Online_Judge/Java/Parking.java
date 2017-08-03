package parking;

import java.util.Scanner;

/**
 *
 * @author linah
 * UVA
 * ID: 11364
 */
public class Parking {

    static short testCases, shops;
    static short min;
    static short max;
    static short val;
    static Scanner scanner;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        scanner = new Scanner(System.in);
        testCases = scanner.nextShort();
        while ((testCases--) != 0) {
            shops = scanner.nextShort();
            min = 100;
            max = 0;
            while ((shops--) != 0) {
                val = scanner.nextShort();
                if (val > max) {
                    max = val;
                }
                if (val < min) {
                    min = val;
                }
            }
            System.out.println((max - min) * 2);
        }
    }
}
