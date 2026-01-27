package Assignment7;

import java.util.*;

public class Exercise3_Reserve {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String n = sc.nextLine();
        char[] arr = n.toCharArray();
        for (int i = 0; i < n.length() / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        System.out.print(new String(arr));
    }
}
