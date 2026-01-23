package Exercise2301;

import java.util.*;

public class Exercise1_CreateAndPopulate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.print("Nhap vao kich thuoc mang: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap so nguyen(1-10): ");
            int x = sc.nextInt();
            numbers.add(x);
        }
        for (Integer number : numbers) {
            System.out.print("Cac phan tu trong mang " + number + " ");
        }
    }
}
