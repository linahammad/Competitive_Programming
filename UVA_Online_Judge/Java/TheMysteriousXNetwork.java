package the.mysterious.x.network;

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
 * ID: 1148
 */
public class TheMysteriousXNetwork {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Reader.init(System.in);
        StringBuffer sb = new StringBuffer();

        int cases = Reader.nextInt();
        for (int h = 0; h < cases; h++) {
            Graph g = new Graph();

            int m = Reader.nextInt();
            for (int i = 0; i < m; i++) {
                String node = Reader.next();
                g.getVertex(node);
                int num = Reader.nextInt();
                String arr[] = new String[num];
                for (int j = 0; j < num; j++) {
                    arr[j] = Reader.next();
                    g.addEdge(node, arr[j], 1.0);
                }
            }
            String begin = Reader.next();
            String end = Reader.next();
            if ((cases - 1) == h) {
                sb.append(begin).append(" ").append(end).append(" ").append(g.bfs(begin, end)).append("\n");
            } else {
                sb.append(begin).append(" ").append(end).append(" ").append(g.bfs(begin, end)).append("\n\n");
            }

        }

        System.out.print(sb);

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

    public int bfs(String root, String dest) {
        int shortestPath = 0;
        Queue<Vertex> queue = new LinkedList<Vertex>();
        Vertex r = getVertex(root);
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
                    shortestPath = w.level;
                }
                if (w.name.equals(dest)) {
                    st = true;
                    return shortestPath - 1;
                }
            }
        }
        return 0;
    }
}

class Reader {

    static BufferedReader reader;
    static StringTokenizer tokenizer;

    static void init(InputStream input) {
        reader = new BufferedReader(
                new InputStreamReader(input));
        tokenizer = new StringTokenizer("");
    }

    static String next() throws IOException {
        while (!tokenizer.hasMoreTokens()) {
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
}
