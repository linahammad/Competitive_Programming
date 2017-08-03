
package event.planning;

import java.util.Scanner;

/**
 *
 * @author linah 
 * UVA 
 * ID: 11559
 */
public class EventPlanning {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int participants = in.nextInt();
            int budget = in.nextInt();
            int hotels = in.nextInt();
            int weeks = in.nextInt();

            int min = 999999999;
            for (int j = 0; j < hotels; j++) {
                int price = in.nextInt();
                int bed[] = new int[weeks];
                for (int i = 0; i < bed.length; i++) {
                    bed[i] = in.nextInt();
                    int cost = price * participants;
                    if (bed[i] >= participants && budget >= cost) {
                        if (min > cost) {
                            min = cost;
                        }
                    }

                }
            }
            if (min != 999999999) {
                System.out.println(min);
            } else {
                System.out.println("stay home");
            }

        }
    }

}
