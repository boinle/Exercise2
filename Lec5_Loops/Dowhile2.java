package Lec5_Loops;

import java.util.Scanner;

public class Dowhile2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int number;
        do {
            System.out.print("Enter a number (-1 to quit) : ");
            number = sc.nextInt();
            sum += number;
        } while (number != -1);
        System.out.println("The total is " + sum);
    }

}
