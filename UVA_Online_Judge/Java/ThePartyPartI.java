
package the.party.part.i;

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
 * ID: 10959
 */
public class ThePartyPartI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        boolean first = true;

        while (cases-- > 0) {
            Graph g = new Graph();
            int n1 = in.nextInt();//??? ??????? ???????? 
            int n2 = in.nextInt();
            for (int i = 0; i < n2; i++) {
                String begin = in.next();
                String end = in.next();
                g.getVertex(begin);
                g.getVertex(end);
                g.addEdge(begin, end, 1.0);
                g.addEdge(end, begin, 1.0);

            }

            if (first) {
                first = false;
            } else {
                System.out.println();
            }

            g.bfs(n1);

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
  
    boolean st = false;
    

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

    public void bfs(int N) {

        Queue<Vertex> queue = new LinkedList<Vertex>();
        Vertex r = getVertex("0");
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

        for (int i = 1; i < N; i++) {
            Vertex v = getVertex("" + i);
            System.out.println(v.level);
        }

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
