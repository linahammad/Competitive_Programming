
package throwing.cards.away.i;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author linah 
 * UVA 
 * ID: 10935
 */
public class ThrowingCardsAwayI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        StringBuffer sb2 = new StringBuffer();

        while (true) {
            Boolean flag = false;

            Deque<Integer> dq = new LinkedList<>();
            ArrayList<Integer> list = new ArrayList<Integer>();
            int y = in.nextInt();
            if (y == 0) {
                break;
            }
            if (y == 1) {
                System.out.println("Discarded cards:");
                System.out.println("Remaining card: 1");
                flag = true;
            }
            if (flag == false) {
                for (int i = 1; i <= y; i++) {
                    dq.add(i);
                }
                Collections.sort((List<Integer>) dq);
                while (true) {
                    list.add(dq.getFirst());
                    dq.removeFirst();
                    dq.addLast(dq.removeFirst());
                    if (dq.size() == 1) {
                        break;
                    }
                }

                System.out.print("Discarded cards: ");
                for (int i = 0; i < list.size(); i++) {
                    if (i != list.size() - 1) {
                        System.out.print(list.get(i) + ", ");
                    } else {
                        System.out.println(list.get(i));
                    }

                }
                System.out.println("Remaining card: " + dq.getFirst());

            }
        }

    }

}
