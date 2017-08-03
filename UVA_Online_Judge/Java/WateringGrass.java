/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package watering.grass;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author linah 
 * UVA 
 * ID: 10382
 */
public class WateringGrass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            int ans = 0;
            int n = in.nextInt();
            int l = in.nextInt();
            int w = in.nextInt();
            int wi = 0;
            int d = 0;
            Water k[] = new Water[n];
            for (int i = 0; i < n; i++) {
                int a = in.nextInt();
                double b = in.nextInt();
                double dx = Math.sqrt((double) b * b - (w * w) / 4.0);
                k[i] = new Water(a - dx, a + dx);
            }
            Arrays.sort(k);
            int p = 0;
            double end = 0;
            int count = 0;
            boolean check = true;
            while (end < l && check) {
                double max = end;
                int j;
                check = false;
                for (j = p; j < n && k[j].start <= end; j++) {
                    check = true;
                    max = Math.max(max, k[j].end);
                }
                if (end != max) {
                    count++;
                }
                end = max;
                p = j;
            }
            if (!check) {
                ans += -1;
            } else {
                ans += count;
            }

            System.out.println(ans);
        }
    }
}

class Water implements Comparable<Water> {

    double start;
    double end;

    public Water(double s, double e) {
        start = s;
        end = e;

    }

    public int compareTo(Water o) {
        if (Double.compare(start, o.start) != 0) {
            return Double.compare(start, o.start);
        } else {
            return Double.compare(end, o.end);
        }

    }
}
