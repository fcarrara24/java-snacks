package org.learning.esercizi.snack3;

import java.util.Arrays;

public class Snack3 {
    //Crea un array di numeri interi e fai la somma di tutti gli elementi che sono in posizione dispari
    public static void main(String[] args) {
        int[] arrInteri = {1,4,6,234,56,23,645,45,3,4,34,2};
        int contatore= 0;
        // stampo l'array
        System.out.println("array partenza: "+Arrays.toString(arrInteri));

        for (int i = 0; i < arrInteri.length; i++) {
            // se sono in posizione dispari ( si considera dispari la posizione rispetto a un contatore che parte da 0)
            if(i%2 == 1){
                contatore += arrInteri[i];
            }
        }

        System.out.println("somma dei numeri in posizione dispari "+contatore);
    }
}
