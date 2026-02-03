package Lec5_Loops;

import java.util.Scanner;

public class Dowhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phrase;
        do {
            System.out.print("Type your password: ");
            phrase = sc.next();
        } while (!phrase.equals("duytan"));
    }

}
