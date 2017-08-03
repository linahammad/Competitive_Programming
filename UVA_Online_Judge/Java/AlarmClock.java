package alarmclock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author linah
 * UVA
 * ID: 11677
 */
public class AlarmClock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NumberFormatException,
            IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        StringBuilder ans = new StringBuilder();
        while ((line = in.readLine()) != null) {
            String[] t = line.split(" ");
            int H1 = Integer.parseInt(t[0]);
            int M1 = Integer.parseInt(t[1]);
            int H2 = Integer.parseInt(t[2]);
            int M2 = Integer.parseInt(t[3]);

            if (H1 == 0 && H2 == 0 && M1 == 0 && M2 == 0) {
                break;
            }
            int start = H1 * 60 + M1;
            int end = H2 * 60 + M2;
            int mins = end - start;
            if (mins < 0) {
                mins = mins + 1440;
            }
            ans.append(mins).append("\n");
        }
        System.out.print(ans.toString());
    }
}
