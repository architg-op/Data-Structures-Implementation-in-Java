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
public class Node {
    public int data;
    public Node left, right;
    public Node(int d) {
        data = d;
        left = right = null;
    }
}
