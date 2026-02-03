package Lec4_ConditionalExecution;

import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter operator (+,-,*,/)");
        char dau = sc.next().charAt(0);
        int result = 0;
        boolean valid = true;
        switch (dau) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Error");
                    valid = false;
                }
                break;
            default:
                System.out.println("Error");
        }
        if (valid) {
            System.out.println(a + " " + dau + " " + b + " = " + result);
        }
    }
}
