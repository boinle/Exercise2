package Assignment7;

import java.util.*;

public class Exercise7_ExtractNumbersFromAString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String n = sc.nextLine();
        char[] arr = n.toCharArray();
        for (int i = 0; i < n.length(); i++) {
            if (arr[i] >= '0' && arr[i] <= '9') {
                System.out.print(arr[i]);
            }
        }
    }
}
