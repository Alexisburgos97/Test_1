package org.alexisburgos;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Integer[]lista = {1,2,3,4,5};
        Integer d = 4;

        for(int i = 0; i <= d; i++){
            mostrar(lista);
            rotar(lista,d);
        }

    }

    public static Integer[] rotar(Integer[] lista, Integer d){

        int primero = lista[0];
        int i=0;


        for (i = 0; i < d; i++) {
            lista[i] = lista[i + 1];
        }
        lista[i] = primero;

        return lista;
    }

    public static void mostrar(Integer[] lista){
        System.out.print(Arrays.toString(lista) + "  ");

    }

}
