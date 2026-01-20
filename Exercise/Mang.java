package Exercise;

import java.util.*;

public class Mang {

    public static void xuatmang(int mang[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(mang[i] + " ");
        }
    }

    public static void daonguoc(int mang[], int n) {
        for (int i = 0; i < n / 2; i++) {
            int temp = mang[i];
            mang[i] = mang[n - 1 - i];
            mang[n - 1 - i] = temp;
        }
    }

    public static void sochan(int mang[], int n) {
        System.out.print("Cac so chan trong mang: ");
        for (int i = 0; i < n; i++) {
            if (mang[i] % 2 == 0) {
                System.out.print(mang[i] + " & ");
            }
        }
    }

    public static int tongcacso(int mang[], int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (mang[i] % 3 == 0 && mang[i] % 5 == 0) {
                sum += mang[i];
            }
        }
        return sum;
    }

    public static void tangdan(int mang[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (mang[i] > mang[j]) {
                    int temp = mang[i];
                    mang[i] = mang[j];
                    mang[j] = temp;
                }
            }
        }
    }

    public static void giamdan(int mang[]) {
//        for (int i = 0; i < n; i++) { 
        for (int i = 0; i < mang.length; i++) {
            for (int j = i + 1; j < mang.length; j++) {
                if (mang[i] < mang[j]) {
                    int temp = mang[i];
                    mang[i] = mang[j];
                    mang[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int[] mang = new int[100];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap so nguyen: ");
            mang[i] = sc.nextInt();
        }
        xuatmang(mang, n);
        System.out.println();
        daonguoc(mang, n);
        xuatmang(mang, n);
        System.out.println();
        sochan(mang, n);
        System.out.println();
        System.out.println("Tong cac so chia het cho ca 3 va 5 la " + tongcacso(mang, n));
        tangdan(mang, n);
        xuatmang(mang, n);
        System.out.println();
        giamdan(mang, n);
        xuatmang(mang, n);
    }
}
