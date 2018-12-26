/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author architgarg
 */
public class Graph {
    
    int adj[][];
    int V;
    
    Graph(int v) {
        adj = new int[v][v];
        V = v;
    }
    
    void add(int u, int v) {
        adj[u][v] = 1;
        adj[v][u] = 1;
    }
    
    void printGraph() {
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
               System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]) {
        Graph g = new Graph(13);
        g.add(0, 6);
        g.add(0, 5);
        g.add(0, 1);
        g.add(0, 2);
        g.add(0, 0);
        g.add(5, 3);
        g.add(5, 4);
        g.add(4, 6);
        g.add(6, 0);
        g.add(5, 0);
        g.add(1, 0);
        g.add(2, 0);
        g.add(3, 5);
        g.add(4, 5);
        g.add(6, 4);
        g.add(7, 8);
        g.add(8, 7);
        g.add(9, 10);
        g.add(10, 11);
        g.add(10, 9);
        g.add(11, 10);
        g.add(9, 12);
        g.add(12, 9);
        g.add(9, 11);
        g.add(11, 9);
        g.printGraph();
    }
}
