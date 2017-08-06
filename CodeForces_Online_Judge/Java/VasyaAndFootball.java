/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vasyaandfootball;

import java.util.Scanner;

/**
 *
 * @author linah 
 * CodeFprces
 * ID: 493A
 */
public class VasyaAndFootball {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String team_h = input.nextLine(), team_a = input.nextLine();
        int num = input.nextInt();

        String arr[][] = new String[num][4];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = input.next();
            }
        }

        int l = 0, d = 0;
        String temp[][] = new String[num][2];
        String ans[][] = new String[num][2];
        String flag = "yes";

        for (int i = 0; i < num; i++) {

            for (int p = 0; p < ans.length; p++) {
                if (arr[i][1].equals(ans[p][0]) && arr[i][2].equals(ans[p][1])) {
                    flag = "no";
                    break;
                }
            }

            if (flag.equals("yes")) {
                for (int y = 0; y < temp.length; y++) {
                    if (arr[i][1].equals(temp[y][0]) && arr[i][2].equals(temp[y][1]) && arr[i][1].equals("h") && arr[i][3].equals("y")) {
                        System.out.println(team_h + " " + arr[i][2] + " " + arr[i][0]);
                        temp[y][0] = "l";
                        temp[y][1] = "l";
                        ans[d][0] = arr[i][1];
                        ans[d][1] = arr[i][2];
                        d++;

                    } else if (arr[i][1].equals(temp[y][0]) && arr[i][2].equals(temp[y][1]) && arr[i][1].equals("a") && arr[i][3].equals("y")) {
                        System.out.println(team_a + " " + arr[i][2] + " " + arr[i][0]);
                        temp[y][0] = "l";
                        temp[y][1] = "l";
                        ans[d][0] = arr[i][1];
                        ans[d][1] = arr[i][2];
                        d++;

                    }
                }

                if (arr[i][3].equals("r") && arr[i][1].equals("h")) {
                    System.out.println(team_h + " " + arr[i][2] + " " + arr[i][0]);
                    ans[d][0] = arr[i][1];
                    ans[d][1] = arr[i][2];
                    d++;

                } else if (arr[i][3].equals("r") && arr[i][1].equals("a")) {
                    System.out.println(team_a + " " + arr[i][2] + " " + arr[i][0]);
                    ans[d][0] = arr[i][1];
                    ans[d][1] = arr[i][2];
                    d++;

                } else {
                    temp[l][0] = arr[i][1];
                    temp[l][1] = arr[i][2];
                    l++;
                }

            }
            flag = "yes";

        }
    }

}
