/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapimp;

/**
 *
 * @author architgarg
 */

import java.util.*;

public class MapImp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Map<String, String> map = new HashMap<>();
        map.put("myName", "Archit");
        map.put("myAge", "18");
        map.put("myCollege", "Chitkara");
        System.out.println(map);
    }
    
}
