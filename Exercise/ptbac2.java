package Exercise;

import java.util.Scanner;

public class ptbac2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();
        System.out.println("(" + a + ")" + "x^2 + " + "(" + b + ")" + "x + " + "(" + c + ")" + " = 0");
        if (a == 0) {
            System.out.println("Error!");
        } else {
            double delta = b * b - 4 * a * c;
            if (delta > 0) {
                System.out.println("The equation has two distinct solutions: x1 = " + (-b + Math.sqrt(delta)) / 2 * a + " va x2 = " + (-b - Math.sqrt(delta)) / 2 * a);
            } else if (delta == 0) {
                System.out.println("The equation has a double root x = " + -b / 2 * a);
            } else {
                System.out.println("unsolved equation!");
            }
        }
    }
}
