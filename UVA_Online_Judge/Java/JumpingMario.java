/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

/**
 * Class for buffered reading int and double values
 */
/**
 * http://www.cpe.ku.ac.th/~jim/java-io.html
 */
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

    /**
     * get next word
     */
    static String next() throws IOException {
        while (!tokenizer.hasMoreTokens()) {
            //TODO add check for eof if necessary  
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
