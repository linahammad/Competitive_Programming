package tellmethefrequencies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author linah 
 * UVA
 * ID: 10062
 *
 */
public class TellMeTheFrequencies {

    static class Pair implements Comparable<Pair> {

        int c, f;

        public Pair(int c, int f) {
            this.c = c;
            this.f = f;
        }

        public int compareTo(Pair p) {
            if (this.f != p.f) {
                return this.f - p.f;
            }
            return p.c - this.c;
        }

        public String toString() {
            return c + " " + f;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String line;
        boolean first = true;
        while ((line = in.readLine()) != null) {
            int[] freq = new int[256];
            for (char c : line.toCharArray()) {
                ++freq[c];
            }
            List<Pair> pairs = new ArrayList<Pair>();
            for (int i = 0; i < 256; ++i) {
                if (freq[i] > 0) {
                    pairs.add(new Pair(i, freq[i]));
                }
            }
            Collections.sort(pairs);

            if (first) {
                first = false;
            } else {
                System.out.println();
            }
            for (Pair p : pairs) {
                System.out.println(p);
            }
        }

    }

}
