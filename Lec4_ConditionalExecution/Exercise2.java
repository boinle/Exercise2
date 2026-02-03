package Lec4_ConditionalExecution;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What percentage did you earn?");
        int p = sc.nextInt();
        if (p >= 90) {
            System.out.println("You got an A!");
        } else if (p >= 80) {
            System.out.println("You got a B");
        } else if (p >= 70) {
            System.out.println("You got a C!");
        } else if (p >= 60) {
            System.out.println("you got a D!");
        }
        else if (p < 60) {
            System.out.println("You got a F!");
        }
    }
}
