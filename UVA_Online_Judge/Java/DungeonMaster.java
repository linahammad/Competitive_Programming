/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon.master;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author linah 
 * UVA 
 * ID: 532
 */
public class DungeonMaster {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner Input = new Scanner(System.in);
        Reader.init(System.in);
        StringBuilder sb = new StringBuilder();
        while (true) {
            Graph.l = Reader.nextInt();
            Graph.r = Reader.nextInt();
            Graph.c = Reader.nextInt();
            if (Graph.l == 0 && Graph.r == 0 && Graph.c == 0) {
                break;
            }
            Graph.fillcube();
            Graph g = new Graph();
            String root = Graph.sr + " " + Graph.sc + " " + Graph.sl;
            String dest = Graph.er + " " + Graph.ec + " " + Graph.el;
            g.BuildGraphBFS(root, dest);
            if (!g.getVertex(dest).found) {
                sb.append("Trapped!\n");

            } else {
                sb.append("Escaped in ").append(g.getVertex(dest).level).append(" minute(s).\n");

            }
        }

        System.out.print(sb);
    }
}

class Reader {

    static BufferedReader reader;
    static StringTokenizer tokenizer;

    /**
     * call this method to initialize reader for InputStream
     */
    static void init(InputStream input) {
        reader = new BufferedReader(
                new InputStreamReader(input));
        tokenizer = new StringTokenizer("");
    }

    /**
     * get next word
     */
    static String next() throws IOException {
        while (!tokenizer.hasMoreTokens()) {
//TODO add check for eof if necessary
            tokenizer = new StringTokenizer(
                    reader.readLine());
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static String nextLine() throws IOException {
        return reader.readLine();
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
    List<Edge> adj;
    boolean done;
    boolean added;
    int level;
    boolean found;

    public Vertex(String n) {
        name = n;
        adj = new LinkedList<Edge>();
    }
}

class Graph {

    static char[][][] cube;
    static int l, r, c;
    static int sl, sr, sc, el, er, ec;

    public static void fillcube() throws IOException {
        // Scanner Input =new Scanner(System.in);
        cube = new char[r][c][l];
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < r; j++) {
                String s = Reader.next();
                //System.out.print(s);
                for (int k = 0; k < c; k++) {
                    cube[j][k][i] = s.charAt(k);
                    if (cube[j][k][i] == 'S') {
                        sl = i;
                        sr = j;
                        sc = k;
                        cube[j][k][i] = '.';

                    } else if (cube[j][k][i] == 'E') {
                        el = i;
                        er = j;
                        ec = k;
                        cube[j][k][i] = '.';

                    }

                }

            }
        }

    }
    private Map<String, Vertex> vertexMap = new HashMap<String, Vertex>();
    public static int count = 0;

    public void reset() {
        for (Map.Entry<String, Vertex> entry : vertexMap.entrySet()) {
            entry.getValue().done = false;
            entry.getValue().added = false;
            entry.getValue().level = 0;
            entry.getValue().found = false;

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

    public void dfTrav(String s) {
        Vertex v = getVertex(s);
        for (Iterator it = v.adj.iterator(); it.hasNext();) {
            Vertex w = ((Edge) it.next()).dest;
            if (!w.done) {
                w.done = true;
                count++;
                dfTrav(w.name);
            }

        }

    }

    public void BuildGraphBFS(String root, String dest) {
        Vertex ro = getVertex(root);
        Queue<Vertex> q = new LinkedList<Vertex>();
        q.add(ro);
        ro.added = true;
        ro.level = 0;
        while (!q.isEmpty()) {
            Vertex v = q.remove();
            v.done = true;
            if (v.name.equals(dest)) {
                v.found = true;
                return;
            }
            String[] rcl = v.name.split(" ");
            int rx = Integer.parseInt(rcl[0]);
            int cy = Integer.parseInt(rcl[1]);
            int lz = Integer.parseInt(rcl[2]);
            if (rx > 0 && Graph.cube[rx - 1][cy][lz] != '#') {
                Vertex w = getVertex((rx - 1) + " " + cy + " " + lz);
                if (!w.done && !w.added) {
                    q.add(w);
                    w.added = true;
                    w.level = v.level + 1;
                    addEdge(v.name, w.name, 1);

                }

            }
            if (rx < Graph.r - 1 && Graph.cube[rx + 1][cy][lz] != '#') {
                Vertex w = getVertex((rx + 1) + " " + cy + " " + lz);
                if (!w.done && !w.added) {
                    q.add(w);
                    w.added = true;
                    w.level = v.level + 1;
                    addEdge(v.name, w.name, 1);

                }

            }
            if (cy > 0 && Graph.cube[rx][cy - 1][lz] != '#') {
                Vertex w = getVertex((rx) + " " + (cy - 1) + " " + lz);
                if (!w.done && !w.added) {
                    q.add(w);
                    w.added = true;
                    w.level = v.level + 1;
                    addEdge(v.name, w.name, 1);

                }
            }
            if (lz > 0 && Graph.cube[rx][cy][lz - 1] != '#') {
                Vertex w = getVertex((rx) + " " + cy + " " + (lz - 1));
                if (!w.done && !w.added) {
                    q.add(w);
                    w.added = true;
                    w.level = v.level + 1;
                    addEdge(v.name, w.name, 1);

                }
            }
            if (cy < Graph.c - 1 && Graph.cube[rx][cy + 1][lz] != '#') {
                Vertex w = getVertex((rx) + " " + (cy + 1) + " " + lz);
                if (!w.done && !w.added) {
                    q.add(w);
                    w.added = true;
                    w.level = v.level + 1;
                    addEdge(v.name, w.name, 1);

                }
            }
            if (lz < Graph.l - 1 && Graph.cube[rx][cy][lz + 1] != '#') {
                Vertex w = getVertex((rx) + " " + cy + " " + (lz + 1));
                if (!w.done && !w.added) {
                    q.add(w);
                    w.added = true;
                    w.level = v.level + 1;
                    addEdge(v.name, w.name, 1);

                }
            }
        }
    }

    public void bfs(String root, String dest) {
        Queue<Vertex> q = new LinkedList<Vertex>();
        Vertex r = getVertex(root);

        q.add(r);

        r.added = true;
        r.level = 0;

        while (!q.isEmpty()) {
            Vertex v = q.remove();
            v.done = true;
            for (Iterator it = v.adj.iterator(); it.hasNext();) {
                Vertex w = ((Edge) it.next()).dest;
                if (!w.added && !w.done) {
                    q.add(w);
                    w.added = true;
                    w.level = v.level + 1;
                }
                if (w.name.equals(dest)) {
                    w.found = true;
                    return;
                }
            }

        }
    }

}
