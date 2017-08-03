package costcutting;

import java.util.Scanner;

/**
 *
 * @author linah 
 * UVA
 * ID: 11727
 *
 */
public class CostCutting {

    static int testCases;
    static int max;
    static int min;
    static int a;
    static int b;
    static int c;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        testCases = scanner.nextInt();
        for (int i = 1; i < testCases + 1; i++) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
            System.out.print("Case " + i + ": ");
            if (a > b) {
                if (b > c) {
                    System.out.println(b);
                    continue;
                }
                if (a > c) {
                    System.out.println(c);
                    continue;
                }
                System.out.println(a);
                continue;
            }
            if (a > c) {
                System.out.println(a);
                continue;
            }
            if (b > c) {
                System.out.println(c);
                continue;
            }
            System.out.println(b);
            continue;
        }
    }
}
