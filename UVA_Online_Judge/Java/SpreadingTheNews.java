/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spreading.the.news;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author linah 
 * UVA 
 * ID: 924
 */
public class SpreadingTheNews {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /**
         * @param args the command line arguments
         */
        Scanner in = new Scanner(System.in);
        Graph g = new Graph();
        int num = in.nextInt();
        for (int i = 0; i < num; i++) {
            g.getVertex(i + "");
            int n1 = in.nextInt();
            for (int y = 0; y < n1; y++) {
                int n2 = in.nextInt();
                g.addEdge(i + "", n2 + "", 1.0);
            }

        }
        int t = in.nextInt();
        in.nextLine();
        for (int i = 0; i < t; i++) {
            String p = in.next();
            g.bfs(p);
            g.frequent(num);
            g.reset();
        }

    }

}

class Edge {

    Vertex dest;
    double cost;

    public Edge(Vertex d, double c) {
        dest = d;
        cost = c;
    }
}

class Vertex {

    String name;
    int level;
    List<Edge> adj;
    boolean done;
    boolean added;

    public Vertex(String n) {
        name = n;
        adj = new LinkedList<Edge>();
    }
}

class Graph {

    private Map<String, Vertex> vertexMap = new HashMap<String, Vertex>();
//    
    boolean st = false;
//      

    public void reset() {
        for (Map.Entry<String, Vertex> entry : vertexMap.entrySet()) {
            entry.getValue().done = false;
            entry.getValue().added = false;
            entry.getValue().level = 0;
        }
    }

    public Vertex getVertex(String vName) {
        Vertex v = vertexMap.get(vName);
        if (v == null) {
            v = new Vertex(vName);
            vertexMap.put(vName, v);
        }
        return v;
    }

    public void addEdge(String begin, String end, double c) {
        Vertex v = getVertex(begin);
        Vertex w = getVertex(end);
        v.adj.add(new Edge(w, c));
    }

    public void bfs(String source) {

        Queue<Vertex> queue = new LinkedList<Vertex>();

        Vertex r = getVertex(source);

        queue.add(r);

        r.added = true;

        while (!queue.isEmpty()) {

            Vertex v = queue.remove();

            v.done = true;

            for (Iterator it = v.adj.iterator(); it.hasNext();) {

                Vertex w = ((Edge) it.next()).dest;

                if (!w.done && !w.added) {

                    queue.add(w);

                    w.added = true;

                    w.level = v.level + 1;

                }

            }

        }

    }

    public void frequent(int N) {

        int arr[] = new int[N];

        for (int i = 0; i < N; i++) {

            Vertex r = getVertex(i + "");

            arr[i] = r.level;

        }

        int[] freq = new int[N];

        for (int x : arr) {

            freq[x] += 1;

        }

        int max = 0;

        int index = -1;

        for (int i = 1; i < freq.length; i++) {

            if (freq[i] > max) {
                max = freq[i];
                index = i;

            }
        }

        if (max != 0) {
            System.out.println(max + " " + index);
        } else {
            System.out.println(max);
        }

    }
}
