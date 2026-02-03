package Exercise2301_ArrayListExam;

import java.util.*;

public class Exercise4_CheckForAnElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> city = new ArrayList<>();
        System.out.print("Nhap so luong thanh pho: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap ten thanh pho thu " + (i + 1) + ": ");
            String x = sc.nextLine();
            city.add(x);
        }
        for (int i = 0; i < n; i++) {
            if (city.get(i).equals("London")) {
                System.out.println(city.get(i));
            }
        }
    }
}
