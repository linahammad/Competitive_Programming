package jumpingmario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author linah 
 * UVA
 * ID: 11764
 *
 */
public class JumpingMario {

    public static void main(String[] args) throws Exception {
        Reader.init(System.in);
        int noOfTestCases = Reader.nextInt();
        for (int currentCase = 1; currentCase <= noOfTestCases; currentCase++) {
            int noOfWalls = Reader.nextInt() - 1;
            int currentWall = Reader.nextInt();
            int smallJumps = 0;
            int bigJumps = 0;
            while ((noOfWalls--) > 0) {
                int thisWall = Reader.nextInt();
                if (thisWall < currentWall) {
                    smallJumps++;
                } else if (thisWall > currentWall) {
                    bigJumps++;
                }
                currentWall = thisWall;
            }
            System.out.println("Case " + currentCase + ": " + bigJumps + " " + smallJumps);
        }
    }
}


class Reader {

    static BufferedReader reader;
    static StringTokenizer tokenizer;

    /**
     * call this method to initialize reader for InputStream
     */
    static void init(InputStream input) {
        reader = new BufferedReader(new InputStreamReader(input));
        tokenizer = new StringTokenizer("");
    }

    static String next() throws IOException {
        while (!tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(reader.readLine());
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }
}
