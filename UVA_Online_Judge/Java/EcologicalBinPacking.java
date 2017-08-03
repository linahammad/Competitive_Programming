package ecologicalbinpacking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author linah
 * UVA
 * ID: 102
 */
public class EcologicalBinPacking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NumberFormatException,
            IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(
                System.in));
        String newline = in.readLine();
        String[] glasses;
        int[] bins = new int[9];
        int[] scores;
        int sum = 0, min = 0, strIndex = 0;
        String[] BGC = new String[6];
        BGC[1] = "BGC";
        BGC[0] = "BCG";
        BGC[4] = "GBC";
        BGC[5] = "GCB";
        BGC[2] = "CBG";
        BGC[3] = "CGB";

        while (newline != null) {
            scores = new int[6];
            glasses = newline.split(" ");
            for (int i = 0; i < 9; i++) {
                bins[i] = Integer.parseInt(glasses[i]);
            }
            scores[1] = bins[3] + bins[6] + bins[1] + bins[7] + bins[2] + bins[5];
            scores[0] = bins[3] + bins[6] + bins[2] + bins[8] + bins[1] + bins[4];
            scores[4] = bins[4] + bins[7] + bins[0] + bins[6] + bins[2] + bins[5];
            scores[5] = bins[4] + bins[7] + bins[2] + bins[8] + bins[0] + bins[3];
            scores[2] = bins[5] + bins[8] + bins[0] + bins[6] + bins[1] + bins[4];
            scores[3] = bins[5] + bins[8] + bins[1] + bins[7] + bins[0] + bins[3];

            min = Integer.MAX_VALUE;
            for (int i = 0; i < 6; i++) {
                if (scores[i] < min) {
                    min = scores[i];
                    strIndex = i;
                }
            }
            System.out.println(BGC[strIndex] + " " + min);
            newline = in.readLine();
        }
    }
}
