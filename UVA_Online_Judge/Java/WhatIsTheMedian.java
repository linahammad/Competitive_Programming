/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whatisthemedian;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 *
 * @author linah 
 * UVA 
 * ID: 10107 
 *
 */
public class WhatIsTheMedian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while (sc.ready()) {
            int x = sc.nextInt();
            int idx = Collections.binarySearch(arr, x);
            arr.add(idx >= 0 ? idx : -1 * idx - 1, x);
            int sz = arr.size();
            int res = (sz & 1) == 1 ? arr.get(sz >> 1) : (arr.get((sz >> 1)) + arr.get(((sz >> 1) - 1)) >> 1);
            out.print(res + "\n");
        }
        out.flush();
        out.close();
    }

    static class Scanner {

        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public double nextDouble() throws IOException {
            String x = next();
            StringBuilder sb = new StringBuilder("0");
            double res = 0, f = 1;
            boolean dec = false, neg = false;
            int start = 0;
            if (x.charAt(0) == '-') {
                neg = true;
                start++;
            }
            for (int i = start; i < x.length(); i++) {
                if (x.charAt(i) == '.') {
                    res = Long.parseLong(sb.toString());
                    sb = new StringBuilder("0");
                    dec = true;
                } else {
                    sb.append(x.charAt(i));
                    if (dec) {
                        f *= 10;
                    }
                }
            }
            res += Long.parseLong(sb.toString()) / f;
            return res * (neg ? -1 : 1);
        }

        public boolean ready() throws IOException {
            return br.ready();
        }

    }

}
