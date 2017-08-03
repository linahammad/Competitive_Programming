/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thedepartmentofredundancydepartment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 *
 * @author linah 
 * UVA
 * ID: 484
 */
public class TheDepartmentOfRedundancyDepartment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String st;
        while ((st = bf.readLine()) != null) {
            Set<Character> s = new HashSet<Character>();
            HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
            //boolean [] b=new boolean[Integer.MAX_VALUE];

            LinkedList l = new LinkedList();
            for (int i = 0; i < st.length(); i++) {
                char c = st.charAt(i);
                if (c != ' ') {
                    if (s.add(c)) {
                        hm.put(c, 1);
                        l.add(c);

                    } else {
                        int co = hm.get(c) + 1;
                        hm.replace(c, co);
                    }
                }
            }

            for (int i = 0; i < l.size(); i++) {

                System.out.println(l.get(i) + " " + hm.get(l.get(i)));
            }
        }
    }
}
