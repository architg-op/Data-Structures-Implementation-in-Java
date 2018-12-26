/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listimp;

import java.util.*;

/**
 *
 * @author architgarg
 */
public class ListImp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Integer> l = new ArrayList<Integer>();
        l.add(5);
        l.add(9);
        l.add(1,6);
        l.forEach(System.out::println);
    }
    
}
