package Exercise2301;

import java.util.*;

public class Exercise9_FindTheLargestAndSmallestElement {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap kich thuoc mang (>=5): ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap so nguyen thu " + (i + 1) + ": ");
            int x = sc.nextInt();
            numbers.add(x);
        }
        int max = numbers.get(0);
        for (int i = 0; i < n; i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }
        System.out.println("The largest is " + max);
        int min = numbers.get(0);
        for (int i = 0; i < n; i++) {
            if (numbers.get(i) < min) {
                min = numbers.get(i);
            }
        }
        System.out.println("The smallest is " + min);
    }
}
