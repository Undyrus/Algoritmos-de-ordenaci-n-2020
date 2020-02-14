/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmosordenación2020;

import java.util.Arrays;

/**
 *
 * @author Ramiro Diego González
 */
public class AlgoritmosOrdenación2020 {

    public void ordenacionBurbuja(int[] numeros) {
        //El método recibe un array de números y lo ordenará
        //mediante el algoritmo de la burbuja
        for (int j = 0; j < numeros.length; j++) {
            for (int i = 0; i < numeros.length-1; i++) {
                if (numeros[i] > numeros[i + 1]) {
                    int aux = numeros[i + 1];
                    numeros[i + 1] = numeros[i];
                    numeros[i] = aux;
                }
            }
        }
    }
    
    int [] lista1 = {13, 27, 455, 621, 23, 1, 15};
    
    public static void main(String[] args) {
        AlgoritmosOrdenación2020 ordenacion = new AlgoritmosOrdenación2020();
        
        System.out.println("Lista sin ordenar:" + Arrays.toString(ordenacion.lista1));
        
        //Ordenación burbuja
        ordenacion.ordenacionBurbuja(ordenacion.lista1);
        
        System.out.println("Lista ordenada:" + Arrays.toString(ordenacion.lista1));
    }

}
