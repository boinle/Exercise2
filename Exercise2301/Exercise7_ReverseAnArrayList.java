package Exercise2301;

import java.util.*;

public class Exercise7_ReverseAnArrayList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Nhap so thu " + (i + 1) + ": ");
            int x = sc.nextInt();
            numbers.add(x);
        }
        int n = 5;
        for (int i = 0; i < n/2; i++) {
            int temp = numbers.get(i);
            numbers.set(i, numbers.get(n - i - 1));
            numbers.set(n - i - 1, temp);
        }
        System.out.println(numbers);
    }
}
