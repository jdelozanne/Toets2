/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liang.Toets2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author julia
 */
public class TestBag {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bag tas = new Bag(5);
        String x = new String("Xobject");
        String y = new String("Yobject");
        String z = new String("Zobject");
        String a = new String("Aobject");
        String b = new String("Bobject");
        String c = new String("Cobject");
        String d = new String("Dobject");

        try {
            tas.add(x);
            tas.add(y);
            tas.add(z);
            tas.add(a);
            tas.add(b);
            tas.add(c);
            
        } catch (FullBagException ex) {
            Logger.getLogger(TestBag.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(tas.take());
    }
    
}
