package Lec4_ConditionalExecution;

import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n) {
            case 3:
            case 5:
            case 7:
                System.out.println("Is prime number");
                break;
            default:
                System.out.println("Not a prime number");
        }
    }
}
