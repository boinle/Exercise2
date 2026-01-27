package Assignment7;

import java.util.*;

public class Exercise5_CountOccurrences {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String n = sc.nextLine();
        System.out.print("Nhap ky tu muon dem: ");
        char x = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == x) {
                count++;
            }
        }
        System.out.print("Output: " + count);
    }

}
