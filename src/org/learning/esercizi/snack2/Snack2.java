package org.learning.esercizi.snack2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Snack2 {
//    Snack2 Generatore di “nomi cognomi” casuali: il Grande Gatsby ha una lista di nomi e una lista di cognomi, e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome.
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String[] nomi = {"Piero", "Carlo", "Marzio", "Alex", "Frank", "Gelsomina", "Rosa", "Giovanna", "Chiara", "Felice"};
            String[] cognomi = {"Mastronzo", "Gesualdo", "Ponzi", "Aragosta", "Armati", "Matteotti", "Astici", "Rantolanti"};
            int indxEx;
            String nomeCognome;
            System.out.print("inserire il numero degli invitati \t");
            int invitati = Integer.parseInt(sc.nextLine());

            Random rnd = new Random();
            //invito 5 persone
            String[] listaInvitati = new String[invitati];
            for (int i = 0; i < listaInvitati.length; i++) {
                //prendi nome
                indxEx = rnd.nextInt(nomi.length);
                nomeCognome = nomi[indxEx];
                //prendi cognome
                indxEx = rnd.nextInt(cognomi.length);
                nomeCognome += (" "+cognomi[indxEx]);

                listaInvitati[i] = nomeCognome;
            }
            sc.close();
            // stampo la lista di invitati
            System.out.println("invitati "+Arrays.toString(listaInvitati));

    }
}
