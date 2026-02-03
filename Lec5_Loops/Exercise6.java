package Lec5_Loops;

import java.util.Scanner;
import java.util.*;

public class Exercise6 {

    public static void main(String[] args) {
        Random rd = new Random();
        int n = rd.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        int x;
        do {
            System.out.print("Nhap so doan: ");
            x = sc.nextInt();
            if (x > n) {
                System.out.println("Nho hon!");
            } else if (x < n) {
                System.out.println("Lon hon!");
            } else {
                System.out.println("Chuc mung!");
            }
        } while (x != n);

    }
}
