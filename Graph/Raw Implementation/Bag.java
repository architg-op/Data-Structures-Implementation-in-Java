package uca;


import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author architgarg
 */
class Bag implements Iterable<Integer> {
    public Node first;
    public Node last;

    public Bag() {
        first = null;
        last = null;
    }
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() 
        {   
            Node temp = first;
            
            @Override
            public boolean hasNext() {
                while (temp != null) {
                    return true;
                }
                return false;
            }

            @Override
            public Integer next() {
                int d = temp.data;
                temp = temp.next;
                return d;
            }
        };
        
    }
    public class Node {
       int data;
       Node next;
       public Node(int d) {
            data = d;
            next = null;
       }
    }
    
    void enque(int d) {
        Node n = new Node(d);
        if (n == null) {
            first = n;
    //        this.
        }
        else {
            last = n;
        }  
    }
}
