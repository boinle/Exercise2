package Lec5_Loops;

import java.util.*;
import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {
        Random rd = new Random();
        Double n = rd.nextDouble() * (100.0 - 1.0) + 1.0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so thuc: ");
        Double x = sc.nextDouble();
        if (x == n) {
            System.out.println(x + " = " + n);
        } else if (x < n) {
            System.out.println(x + " < " + n);
        } else {
            System.out.println(x + " > " + n);
        }
    }
}
