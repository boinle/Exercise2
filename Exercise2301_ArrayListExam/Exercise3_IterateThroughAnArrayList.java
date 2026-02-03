package Exercise2301_ArrayListExam;

import java.util.*;

public class Exercise3_IterateThroughAnArrayList {

    public static void main(String[] args) {
        ArrayList<Double> prices = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong san pham: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap gia san pham " + (i + 1) + ": ");
            double x = sc.nextDouble();
            prices.add(x);
        }
        System.out.print("Gia tung san pham la : ");
        for (Double price : prices) {
            System.out.print(price + " ");
        }
    }
}
