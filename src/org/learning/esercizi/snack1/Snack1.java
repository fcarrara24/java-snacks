package org.learning.esercizi.snack1;

import java.util.Scanner;

//Chiedi all’utente di continuare ad inserire un numero pari compreso tra 10 e 20. Se il numero non corrisponde alla richiesta continuare a chiederlo fino a che non viene inserito un numero valido.
public class Snack1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean valid= false;
        int number;
        // continuo a controllare se il numero inserito è valido, continuo a chiederlo fino a che diventa valido
        do{
            System.out.println("inserire un numero pari compreso tra 10 e 20");
            number = Integer.parseInt(sc.nextLine());
            if(number >= 10 && number <= 20 && number % 2 == 0){
                valid = true;
            }
        } while (!valid);

        System.out.println("il numero "+number+" è valido");
    }
}
