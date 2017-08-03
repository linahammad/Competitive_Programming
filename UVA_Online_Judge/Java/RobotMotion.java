/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robotmotion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author linah 
 * UVA
 * ID: 10116
 */
public class RobotMotion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(
                System.in));
        StringBuilder s = new StringBuilder();
        while (true) {
            StringTokenizer st = new StringTokenizer(buff.readLine());
            int rows = Integer.parseInt(st.nextToken());
            int columns = Integer.parseInt(st.nextToken());
            int start = Integer.parseInt(st.nextToken());
            if (rows == 0 && columns == 0 && start == 0) {
                break;
            }

            char[][] map = new char[rows][columns];
            boolean[][] bools = new boolean[rows][columns];
            int[][] counts = new int[rows][columns];

            int x = 0;
            int y = start - 1;
            for (int i = 0; i < rows; i++) {
                map[i] = buff.readLine().toCharArray();
            }
            bools[x][y] = true;
            int steps = 0;
            while (true) {
                if (map[x][y] == 'W') {
                    y--;
                } else if (map[x][y] == 'N') {
                    x--;
                } else if (map[x][y] == 'S') {
                    x++;
                } else if (map[x][y] == 'E') {
                    y++;
                }

                steps++;
                if (x < 0 || y < 0 || x >= rows || y >= columns) {
                    s.append(steps + " step(s) to exit").append("\n");
                    break;
                }
                if (bools[x][y]) {
                    int temp = steps - counts[x][y];
                    s.append(counts[x][y]
                            + " step(s) before a loop of " + temp + " step(s)").append("\n");
                    break;
                }

                bools[x][y] = true;
                counts[x][y] = steps;
            }
        }
        System.out.print(s);
    }
}
