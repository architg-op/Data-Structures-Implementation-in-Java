/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uca;

import java.util.Iterator;

/**
 *
 * @author architgarg
 */
public class GraphUtils {
    
    public int degree(Graph g,int v) {
        int cnt = 0;
        Iterator<Integer> it = g.adj[v].iterator();
        while (it.hasNext()) {
            cnt++;
            it.next();
        }
         return cnt;                 
    }
    
    public static void main(String args[]) {
        GraphUtils gu = new GraphUtils();
        Graph g = new Graph(13);
        g.addEdge(0, 0);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 6);
        g.addEdge(0, 5);
        g.addEdge(5, 3);
        g.addEdge(5, 4);
        g.addEdge(3, 4);
        g.addEdge(6, 4);
        g.addEdge(7, 8);
        g.addEdge(9, 10);
        g.addEdge(9, 11);
        g.addEdge(9, 12);
        g.addEdge(11, 12);
        System.out.println("Degree of 2 " + gu.degree(g, 2));
         
        
    }
}
