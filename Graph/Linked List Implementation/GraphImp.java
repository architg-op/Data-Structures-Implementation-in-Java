/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphimp;

import java.util.*;


public class GraphImp {

    public int V;
    public LinkedList<Integer> adj[];
    
    public GraphImp(int V) {
        this.V = V;
        adj = new LinkedList[V];
        
        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList();
        }
    }
    
    void addEdge(int u, int v) {
        adj[u].add(v);
        if (u != v) {
            adj[v].add(u);
        }
    }
    
    void printGraph() {
        for (int i = 0; i < this.V; i++) {
            System.out.print("At " + i + " - ");
            for (Integer pcrawl: adj[i]) {
                System.out.print(pcrawl + " ");
            }
            System.out.println();
        }
    }
    
    /*void bfs(int s) {
        boolean visited[] = new boolean[this.V];
        visited[s] = true;
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(s);
        while (queue.size() != 0) {
            s = queue.poll();
            System.out.println(s);
            Iterator<Integer> it = adj[s].iterator();
            while (it.hasNext()) {
                int i = it.next();
                if (!visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }*/
    
    void bfs(int s) {
        boolean visited[] = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(s);
        visited[s] = true;
        while (queue.isEmpty() == false) {
            int n = queue.poll();
            System.out.print(n + " ");
            for (Integer pCrawl : adj[n]) {
                if (!visited[pCrawl]) {
                    visited[pCrawl] = true;
                    queue.add(pCrawl);
                }
            }
        }
    }
    
    public void dfs(int s) {
        boolean visited[] = new boolean[V];
          dfsUtil(s, visited);
    }
    
    public void dfsUtil(int s, boolean visited[]) {
        visited[s] = true;
        System.out.print(s + " ");
        Iterator<Integer> it = adj[s].iterator();
        while (it.hasNext()) {
            int i = it.next();
            if (!visited[i]) {
                dfsUtil(i, visited);
            }
        }
    }
    
    public static void main(String[] args) {
        GraphImp g = new GraphImp(10);
        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3);
      //  g.printGraph();
     //   g.bfs(2);
        g.dfs(2);
    }
    
}
