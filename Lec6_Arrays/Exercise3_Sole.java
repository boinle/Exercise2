package Lec6_Arrays;

import java.util.*;

public class Exercise3_Sole {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.print("Nhap do dai mang: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap so nguyen " + (i + 1) + ": ");
            int x = sc.nextInt();
            numbers.add(x);
        }
        System.out.print("Cac so le trong mang la: ");
        for (int i = 0; i < n; i++) {
            if (numbers.get(i) % 2 != 0) {
                System.out.print(numbers.get(i) + " ");
            }
        }
    }
}
