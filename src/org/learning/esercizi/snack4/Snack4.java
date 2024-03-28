package org.learning.esercizi.snack4;

import java.util.Scanner;

public class Snack4 {
    //    Data in input una stringa verificare se è palindroma
    private static boolean isPalindrome(String str){
        int lastPos = str.length() -1;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(lastPos - i) != str.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("inserire una stringa \t");
        String stringa = sc.nextLine();
        boolean palindroma = Snack4.isPalindrome(stringa);

        System.out.println("la stringa "+(palindroma ? "": "non ")+"è palindroma");

        sc.close();
    }
}
