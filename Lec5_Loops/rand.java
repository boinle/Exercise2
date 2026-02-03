package Lec5_Loops;

import java.util.*;

public class rand {

    public static void main(String[] args) {
        Random rd = new Random();
        int tries = 0;
        int sum = 0;
        while (sum != 7) {
            int roll1 = rd.nextInt(6) + 1;
            int roll2 = rd.nextInt(6) + 1;
            sum = roll1 + roll2;
            System.out.println(roll1 + " + " + roll2 + " = " + sum);
            tries++;
        }
        System.out.println("You won after " + tries + " tries!");
    }

}
