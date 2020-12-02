/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author AlejandroRodriguezB
 */
public class Algoritmos<T> {

    /**
     * Busqueda binaria con comparator
     *
     * P: value!=null && a.size()>0
     * 
     * Q: 0<= mid<=a.size()-1 || -1
     * 
     * @param <T>
     * @param value
     * @param a
     * @param c
     * @return mid || -1 (si no encontrado)
     */
    public <T extends Comparator<T>> int binarySearch(T value, ArrayList<T> a, Comparator c){ 

        int principio = 0;
        int nFinal = a.size() - 1;
        while (principio <= nFinal) {
            int mid = (principio + nFinal) / 2;
            T midVal = a.get(mid);       
            if(c.compare(midVal,value)== 0){
                return mid;
            }
            if (c.compare(midVal,value) < 0) {
                principio = mid + 1;
            } else if (c.compare(midVal,value) > 0) {
                nFinal = mid - 1;
            }
            else{
                return mid;
            }
        }

        return -1;
    }

    /**
     * Busqueda binaria con comparable
     *
     * P: value!=null && a.size()>0
     * 
     * Q: 0<= mid<=a.size()-1 || -1
     * 
     * @param <T>
     * @param a
     * @param value
     * @return mid || -1 (si no encontrado)
     */
    public <T extends Comparable<T>> int binarySearch(ArrayList<T> a, T value) { 
        int principio = 0;
        int nFinal = a.size() - 1;
        int mid;
        while (principio <= nFinal) {
            mid = (principio + nFinal) / 2;
            T midVal = a.get(mid);
            
            if (value.compareTo(midVal) == 0){
                return mid;
            }
            else if (value.compareTo(midVal) < 0) {
                principio = mid  + 1;
            } else{
                nFinal = mid - 1;
            }
            
        }

        return -1;
    }

    /**
     * Ordenación burbuja con comparable
     *
     * P: a.size()>0
     *
     * Q: a.get(0) < a.get(1) < a.get(2) < ... (a ordenado)
     *
     * @param <T>
     * @param a
     * @return a ordenada
     */
    public <T extends Comparable<T>> ArrayList<T> bubblesort(ArrayList<T> a) {

        for (int i = a.size(); i >= 1; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (a.get(j).compareTo(a.get(j + 1)) > 0) {
                    T Swap = a.get(j);
                    a.set(j, a.get(j + 1));
                    a.set(j + 1, Swap);
                }
            }
        }
        return a;
    }

    /**
     * Ordenación burbuja con comparator
     *
     * P: a.size()>0
     *
     * Q: a.get(0) < a.get(1) < a.get(2) < ... (a ordenado)
     *
     * @param <T>
     * @param a
     * @param c
     * @return a ordenado
     */
    public <T extends Comparator<T>> ArrayList<T> bubblesort(ArrayList<T> a, Comparator c) {
        for (int i = a.size(); i >= 1; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (c.compare(a.get(j), a.get(j+1))> 0) {
                    T Swap = a.get(j);
                    a.set(j, a.get(j + 1));
                    a.set(j + 1, Swap);
                }
            }
        }
        return a;
    }
}
