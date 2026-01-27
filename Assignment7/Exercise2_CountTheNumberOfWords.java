package Assignment7;

import java.util.*;

public class Exercise2_CountTheNumberOfWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String n = sc.nextLine();
        int count = 0;
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.print("So luong chu trong chuoi la " + (count + 1));
    }
}
