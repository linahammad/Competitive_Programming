package one.two.three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OneTwoThree {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int linesCount = Integer.parseInt(in.readLine());
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < linesCount; i++) {
            String line = in.readLine();
            if (line.length() == 3) {
                if ((line.charAt(0) == 'o' && line.charAt(1) == 'n')
                        || (line.charAt(0) == 'o' && line.charAt(2) == 'e')
                        || (line.charAt(1) == 'n' && line.charAt(2) == 'e')) {
                    output.append("1\n");
                } else {
                    output.append("2\n");
                }

            } else {
                output.append("3\n");
            }
        }
        System.out.print(output.toString());
    }
}
