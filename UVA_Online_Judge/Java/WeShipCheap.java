package we.ship.cheap;

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
 * ID: 762
 */
public class WeShipCheap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int c = 0;
        while (s.hasNext()) {
            int t = s.nextInt();
            Graph g = new Graph();
            for (int i = 0; i < t; i++) {
                String v1 = s.next();
                String v2 = s.next();
                g.getVertex(v1);
                g.getVertex(v2);
                g.addEdge(v1, v2, 1.0);
                g.addEdge(v2, v1, 1.0);

            }
            if (c >= 1) {
                System.out.println("");
            }
            g.bfs(s.next(), s.next());
            c++;
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
    List<Edge> adj;
    boolean done;
    boolean added;
    int level;

    public Vertex(String n) {
        name = n;
        adj = new LinkedList<Edge>();
        level = -1;
    }
}

class Graph {

    private Map<String, Vertex> vertexMap = new HashMap<String, Vertex>();

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

    public void bfs(String root, String end) {
        Queue<Vertex> q = new LinkedList<Vertex>();
        Vertex begin = getVertex(root);
        begin.level = 0;
        int count = 0;
        q.add(begin);
        begin.added = true;
        String sttr = null;
        while (!q.isEmpty()) {
            Vertex v = q.remove();
            v.done = true;
            for (Iterator it = v.adj.iterator(); it.hasNext();) {
                Vertex w = ((Edge) it.next()).dest;
                if (!w.added && !w.done) {
                    q.add(w);
                    w.added = true;
                    w.level = v.level + 1;
                    if (count == 0) {

                        sttr = w.name;
                        System.out.println(root + " " + w.name);

                    } else {
                        System.out.println(sttr + " " + w.name);
                        sttr = w.name;
                    }
                    count++;
                }

            }
        }
    }
}
