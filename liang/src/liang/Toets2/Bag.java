/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liang.Toets2;

import java.util.ArrayList;

/**
 *
 * @author julia
 */
public class Bag <T>{

    private static int MAX_ELEMENTEN;
    ArrayList<T> lijst;

    public Bag(int x) {
        MAX_ELEMENTEN = x;
        lijst = new ArrayList<>();

    }

    public int max() {
        return MAX_ELEMENTEN;
    }

    public int aantalElementen() {
        int count = 0;
        for (T element : lijst) {
            count++;
        }
        return count;
    }
    
    public void add(T artikel) throws FullBagException {
        if (aantalElementen() < MAX_ELEMENTEN) {
           lijst.add(artikel); 
        }
        else throw new FullBagException();
    }

    public T take() {
        T temp = lijst.get(lijst.size()-1);
        lijst.remove(lijst.size()-1);
        
        return temp;
  



}
}
