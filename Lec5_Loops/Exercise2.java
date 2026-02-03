package Lec5_Loops;

import java.util.*;

public class Exercise2 {

    public static void main(String[] args) {
        Random rd = new Random();
        double n = rd.nextDouble() * (8.0 - 1.8) + 1.8;
        System.out.println("Random number is " + n);
    }
}
