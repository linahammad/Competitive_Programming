/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shippingroutes;

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
 * ID: 383
 */
public class ShippingRoutes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        System.out.println("SHIPPING ROUTES OUTPUT");
        System.out.println();

        for (int l = 1; l <= t; l++) {

            System.out.println("DATA SET  " + l);
            System.out.println();

            Graph g = new Graph();

            int n = s.nextInt();
            int m = s.nextInt();
            int c = s.nextInt();
            s.nextLine();

            for (int i = 0; i < n; i++) {
                String name = s.next();
                g.getVertex(name);
            }

            for (int i = 0; i < m; i++) {
                String begin = s.next();
                String end = s.next();

                g.addEdge(begin, end, 1.0);

                g.addEdge(end, begin, 1.0);
            }

            for (int i = 0; i < c; i++) {
                int cost = s.nextInt();
                int h = g.bfs(s.next(), s.next());
                if (g.st) {
                    System.out.println("$" + cost * (100 * h));
                } else {
                    System.out.println("NO SHIPMENT POSSIBLE");
                }
                g.reset();
                g.st = false;

            }
            System.out.println();
        }
        System.out.println("END OF OUTPUT");
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
                    return shortestPath;
                }
            }
        }
        return 0;
    }
}
