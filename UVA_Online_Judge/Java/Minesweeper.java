package minesweeper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author linah
 * UVA 
 * ID: 10189
 */
public class Minesweeper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NumberFormatException,
            IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String newLine = in.readLine();
        String[] dimensions = newLine.split("\\s");
        int m = Integer.parseInt(dimensions[0]);
        int n = Integer.parseInt(dimensions[1]);
        int[][] board = new int[m][n];
        int counter = 1;
        while (m != 0 && n != 0) {

            for (int i = 0; i < m; i++) {
                newLine = in.readLine();
                for (int j = 0; j < n; j++) {
                    if (newLine.charAt(j) == '*') {
                        board[i][j] = -1;
                        fillBoard(board, i, j, m, n);
                    }
                }
            }
            System.out.println("Field #" + counter++ + ":");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {

                    if (board[i][j] != -1) {
                        System.out.print(board[i][j]);
                    } else {
                        System.out.print("*");
                    }

                }
                System.out.print("\n");
            }

            newLine = in.readLine();
            dimensions = newLine.split("\\s");
            m = Integer.parseInt(dimensions[0]);
            n = Integer.parseInt(dimensions[1]);
            board = new int[m][n];

            if (m != 0 && n != 0) {
                System.out.print("\n");
            }
        }
    }

    public static void fillBoard(int[][] board, int i, int j, int m, int n) {
        if (j < n - 1) {
            if (board[i][j + 1] != -1) {
                board[i][j + 1]++;
            }
            if (i > 0) {
                if (board[i - 1][j + 1] != -1) {
                    board[i - 1][j + 1]++;
                }
            }
            if (i < m - 1) {
                if (board[i + 1][j + 1] != -1) {
                    board[i + 1][j + 1]++;
                }
            }
        }
        if (j > 0) {
            if (board[i][j - 1] != -1) {
                board[i][j - 1]++;
            }
            if (i > 0) {
                if (board[i - 1][j - 1] != -1) {
                    board[i - 1][j - 1]++;
                }
            }
            if (i < m - 1) {
                if (board[i + 1][j - 1] != -1) {
                    board[i + 1][j - 1]++;
                }
            }
        }
        if (i > 0) {
            if (board[i - 1][j] != -1) {
                board[i - 1][j]++;
            }
        }
        if (i < m - 1) {
            if (board[i + 1][j] != -1) {
                board[i + 1][j]++;
            }

        }
    }
}
