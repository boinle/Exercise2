package Exercise2301;

import java.util.*;

public class Exercise10_RemoveDuplicatesFromAnArrayList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        names.add("Bon");
        names.add("Lam");
        names.add("Ngoc");
        names.add("Phuong");
        System.out.print("Nhap so luong ten muon them: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap ten: ");
            String x = sc.next();
            names.add(x);
        }
        for (int i = 0; i < names.size(); i++) {
            for (int j = names.size() - 1; j > i; j--) {
                if (names.get(i).equals(names.get(j))) {
                    names.remove(j);
                }
            }
        }
        System.out.println(names);
    }
}
