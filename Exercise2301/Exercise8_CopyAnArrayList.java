package Exercise2301;

import java.util.*;

public class Exercise8_CopyAnArrayList {

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Nhap ten trai cay thu " + (i + 1) + ": ");
            String x = sc.nextLine();
            fruits.add(x);
        }
        ArrayList<String> copy = new ArrayList<>(fruits);
        System.out.println("Mang goc: " + fruits);
        System.out.println("Mang sao chep: " + copy);
    }
}
