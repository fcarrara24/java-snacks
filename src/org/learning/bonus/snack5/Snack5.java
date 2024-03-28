package org.learning.bonus.snack5;

import java.util.Scanner;

public class Snack5 {
//    Snack5 Data una stringa in input mostrare a video quanti caratteri alfabetici contiene, quanti numeri e quanti simboli non alfanumerici.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("inserire una stringa, verranno contati i caratteri numerici, lettere e simboli");
        String str = sc.nextLine();
        //tolgo gli spazi per non contarli
        String trimStr = str.replaceAll(" ", "");

        char[] arrayChar = trimStr.toCharArray();
        int numbers = 0, letters = 0, symbols = 0;
        for (char ch : arrayChar){
            if(Character.isDigit(ch)){
                numbers += 1;
            } else if (Character.isAlphabetic(ch)){
                letters +=1;
            } else {
                symbols += 1;
            }
        }

        System.out.println("nella stringa "+str+"ci sono: ");
        System.out.println("\t"+letters+" lettere,");
        System.out.println("\t"+numbers+" numeri,");
        System.out.println("\t"+symbols+" simboli");
        sc.close();
    }
}
