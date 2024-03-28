package org.learning.bonus.snack6;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Snack6 {
    //Scrivere un programma che dati dei secondi li converta in ore, minuti, secondi e mostri a video la stringa generata nel formato “hh:mm:ss”
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secondi = 0;
        int toSecondsRate = 1;

        System.out.println("scrivere un numero (no spazi) terminando con \n" +
                "\"s\" per indicare i secondi \n" +
                "\"m\" per indicare i minuti \n" +
                "\"h\" per indicare le ore \n" +
                "ex: 46m");

        String input = sc.nextLine();
        char time = input.charAt(input.length() -1);


        int tempo =  Integer.parseInt(input.substring(0, input.length()-1));
        // analizzo l'input
        switch (time){
            case 's':
                toSecondsRate= 1;
                break;
            case 'm':
                toSecondsRate= 60;
                break;
            case 'h':
                toSecondsRate= 3600;
                break;

        }
        sc.close();

        secondi = tempo * toSecondsRate;
        // ciascuna unuita temporale viene convertita, limitato l'intervallo e aggiunto un padding di 20
        System.out.println("il tempo da lei inserito equivale a "+ String.format("%02d", TimeUnit.SECONDS.toHours(secondi)) +":" //ore
                +String.format("%02d", TimeUnit.SECONDS.toMinutes(secondi)%60)+":" //minuti
                +String.format("%02d", secondi%60)); //secondi
    }
}
