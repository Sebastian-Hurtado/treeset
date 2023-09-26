/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.treesetaccess;

/**
 *
 * @author David
 */


import java.util.*;

public class TreeSetAccess {
    public static void main(String[] args) {
        // Crear un TreeSet de tipo String
        TreeSet<String> treeSet = new TreeSet<>();

        // Agregar elementos al TreeSet
        treeSet.add("Manzana");
        treeSet.add("Banana");
        treeSet.add("Cereza");
        treeSet.add("pera");

        // Acceder a los elementos en orden ascendente
        System.out.println("Elementos en orden ascendente:");
        for (String fruit : treeSet) {
            System.out.println(fruit);
        }
        

        // Acceder al primer y último elemento
        String first = treeSet.first();
        String last = treeSet.last();
        System.out.println("Primer elemento: " + first); // Output: Primer elemento: Banana
        System.out.println("Último elemento: " + last);   // Output: Último elemento: Manzana
        
        for (String valor : treeSet) {
            System.out.println(valor);
        }

        // Obtener un subconjunto de elementos
        SortedSet<String> subset = treeSet.subSet("Banana", "Cereza");
        System.out.println("Subconjunto de elementos entre Banana y Cereza:");
        for (String fruit : subset) {
            System.out.println(fruit);
        }
        // Output:
        // Banana

        // Eliminar un elemento del TreeSet
        treeSet.remove("Cereza");
        System.out.println("Elementos después de eliminar Cereza: " + treeSet);
        // Output: Elementos después de eliminar Cereza: [Banana, Dátil, Manzana]

        // Verificar si un elemento existe en el TreeSet
        boolean exists = treeSet.contains("Manzana");
        System.out.println("¿Manzana existe en el TreeSet? " + exists); // Output: ¿Manzana existe en el TreeSet? true

        // Tamaño del TreeSet
        int size = treeSet.size();
        System.out.println("Tamaño del TreeSet: " + size); // Output: Tamaño del TreeSet: 3
    }
}


