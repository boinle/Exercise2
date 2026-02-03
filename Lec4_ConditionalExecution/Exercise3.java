package Lec4_ConditionalExecution;

import java.util.Scanner;

public class Exercise3 {

    public static int findMaxNumber(int a, int b) {

        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Max number = " + findMaxNumber(a, b));
    }
}
