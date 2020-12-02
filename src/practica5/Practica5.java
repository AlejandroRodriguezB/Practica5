package practica5;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author AlejandroRodriguezB
 */
public class Practica5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //pruevas para comprobar que funciona
        
        //numero de dnis que quieres generar y una lista de dicha longitud
        final int MAX = 10;
        ArrayList<DNI> array = new ArrayList<>(MAX);
        ArrayList<DNI> arrayPrueva = new ArrayList<>(MAX); //arraylist de prueva

        //generamos el nuero deseado de dnis y los añadimos a la lista
        for (int i = 0; i < MAX; i++) {
            DNI dni = new DNI();
            array.add(dni);
        }
        System.out.println("Los DNI generados son: \n" + array);
        Algoritmos alg = new Algoritmos();
        
        //pruevas
        arrayPrueva= alg.bubblesort(array);
        System.out.println("Lista ordenada con comparable: \n" + arrayPrueva);
        arrayPrueva= alg.bubblesort(array, Comparator.comparing(DNI::getNumeros));
        System.out.println("Lista ordenada con comparator: \n" + arrayPrueva);
        
        //parte numerica del DNI a buscar (no pongo el DNI entero porque se vuelve mas dificil de lo que ya es encontrar 2 iguales)
        DNI dni = new DNI(); 
        System.out.println("valor a buscar:" +  dni.getNumeros());
        int a = alg.binarySearch(arrayPrueva, dni);
        if (a==-1){
            System.out.println("No encontrado");
        }
        else {
            System.out.println("encontrado en la posición:" + a);
        }
        
        //parte numerica del DNI a buscar
        dni = new DNI(); //seria muy raro que realmente coincida con otro anterior
        System.out.println("valor a buscar:" +  dni.getNumeros());
        a = alg.binarySearch(dni, arrayPrueva, Comparator.class.cast(dni));
        if (a==-1){
            System.out.println("No encontrado");
        }
        else {
            System.out.println("encontrado en la posición:" + a);
        }
    }
    
}
