/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary.tree;

/**
 *
 * @author architgarg
 */

class Node {
    int data;
    Node left, right;
    public Node(int d) {
        data = d;
        left = right = null;
    }
}


public class BinaryTree {

    Node root;
    
    BinaryTree() {
        root = null;
    }
    
    BinaryTree(int d) {
        root = new Node(d);
    }
    

    public static void main(String[] args) {
        // TODO code application logic here
        BinaryTree bt = new BinaryTree();
        bt.root = new Node(1);
        bt.root.left =  new Node(2);
        bt.root.right = new Node(3);
    }
    
}
