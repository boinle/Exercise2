package Assignment7;

import java.util.*;

public class Exercise1_CountTheNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String n = sc.nextLine();
        int count = 0;
        for (int i = 0; i < n.length(); i++) {
            count++;
        }
        System.out.println("So luong ky tu la " + count);
    }
}
