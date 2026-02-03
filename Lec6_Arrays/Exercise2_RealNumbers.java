package Lec6_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise2_RealNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            System.out.print("Nhap so thuc " + (i + 1) + ": ");
            double x = sc.nextDouble();
            numbers.add(x);
        }
        System.out.println(numbers);
    }
}
