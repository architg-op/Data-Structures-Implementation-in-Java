/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary.search.tree;


/**
 *
 * @author architgarg
 */

public class BinarySearchTree {

    public Node root;
    
    BinarySearchTree() {
        root = null;
    }
    
    BinarySearchTree(int d) {
        root = new Node(d);
    }
    
    void insert(int d) {
        root = insertRec(root, d); 
    }
    
    Node insertRec(Node root, int d) {
        if (root == null) {
            root = new Node(d);
        }
        else if (d <= root.data) {
            root.left = insertRec(root.left,d);
        }
        else {
            root.right = insertRec(root.right,d);
        }
        return root;
    }
    
    void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
    }

    Node deleteNode(Node root, int d) {
        if (root == null) {
            return root;
        }
        else if (d < root.data) {
            root.left = deleteNode(root.left, d);
        }
        else if (d > root.data) {
            root.right = deleteNode(root.right, d);
        }
        else {
            if (root.left == null) {
               return root.right;
            }
            else if (root.right == null) {
                return root.left;
            }
            root.data = minValue(root.right);
            root.right = deleteNode(root.right, root.data);
        }
        return root;
    }
    
    public int minValue(Node n) {
        int minv = n.data;
        while (n.left != null) {
            minv = n.data;
            n = n.left;
        }
        return minv;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(15);
        bst.insert(10);
        bst.insert(20);
        bst.insert(8);
        bst.insert(12);
        bst.insert(17);
        bst.insert(25);
        bst.inOrder(bst.root);
        bst.root = bst.deleteNode(bst.root, 8);
    }
    
}
