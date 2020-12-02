/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5;

import java.util.Comparator;
import java.util.Random;

/**
 *
 * @author AlejandroRodriguezB
 */
public class DNI implements Comparator<DNI>, Comparable<DNI>{  //clase reutilizada del ejercicio de DNIS para hacer pruevas

    //atributos
    private String DNI;
    private int numero;

    //to string
    @Override
    public String toString() {
        return DNI;
    }

    //getters y setters
    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getNumeros() {
        return numero;
    }

    public void setNumeros(int numeros) {
        this.numero = numeros;
    }


    //constructor
    public DNI() {
        this.setNumeros(generaNumero());
        

        this.DNI = "" + this.numero ;
    }

    //metodos para generar random los numeros y letras
    private int generaNumero() {

        Random r = new Random();
        int n = r.nextInt(30);
        return n;
    }

    //override necesario para implementar el comparable
    @Override
    public int compareTo(DNI t) {
         return this.getNumeros()- t.getNumeros();
    }
    
    @Override
    public int compare(DNI t, DNI t1) {
        return t.getNumeros()- t1.getNumeros();
    }

}
