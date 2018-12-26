/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uca;

/**
 *
 * @author architgarg
 */
import java.util.*;
public class Graph {
    int v, e;
    Bag adj[];
    public Graph(int v) {
        this.v = v;
        adj = new Bag[v];
        for (int i = 0; i < v; i++) {
        adj[i] = new Bag();
        }
    }
    void addEdge(int v, int w) {
        adj[v].enque(w);
        if (v != w) 
            adj[w].enque(v);
        e++;
    }
    
     public Iterable<Integer> adj(int v) {
        return adj[v];
    }
    public static void main(String[] args) {
        // TODO code application logic here
     /*   Graph g = new Graph(13);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(2,1);
        System.out.println("Degree of 2 is " + g.degree(2)); */
    }
    
}
