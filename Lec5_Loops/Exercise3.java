package Lec5_Loops;

import java.util.*;

public class Exercise3 {

    public static void main(String[] args) {
        Random rd = new Random();
        int n = rd.nextInt(80 - 3 + 1) + 3;
        if (n % 2 == 0) {
            System.out.println(n + " la so chan");
        } else {
            System.out.println(n + " la so le");
        }
    }
}
