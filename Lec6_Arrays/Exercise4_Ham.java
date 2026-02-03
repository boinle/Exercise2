package Lec6_Arrays;

import java.util.*;

public class Exercise4_Ham {

    public static void nhapMang(ArrayList<Integer> numbers) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap kich thuoc mang: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            int x = sc.nextInt();
            numbers.add(x);
        }
        System.out.println(numbers);
    }

    public static void soChan(ArrayList<Integer> numbers) {
        System.out.println("Cac so chan trong mang: ");
        int dem = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                System.out.println(numbers.get(i) + " tai vi tri " + i + " ");
                dem++;
            }
        }
        System.out.println("Co " + dem + " so chan trong mang");
    }

    public static int sumValues(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        return sum;
    }

    public static void xoaPhanTu(ArrayList<Integer> numbers) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap gia tri muon xoa: ");
        int xoa = sc.nextInt();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == xoa) {
                numbers.remove(i);
                System.out.println("Da xoa gia tri " + xoa);
            }
        }
        System.out.println("Mang sau khi xoa: " + numbers);
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        nhapMang(numbers);
        soChan(numbers);
        System.out.println("Tong cac gia tri trong mang: " + sumValues(numbers));
        xoaPhanTu(numbers);
    }
}
