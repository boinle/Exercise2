package Lec5_Loops;

import java.util.*;
import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int n = rd.nextInt(10) + 1;
        int x;
        int dem = 0;
        do {
            System.out.print("Enter a number: ");
            x = sc.nextInt();
            dem++;
        } while (x != n);
        System.out.println("You won after " + dem + " tries");
        System.out.println("Random number is " + n);
    }
}
