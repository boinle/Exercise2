package Assignment7;

import java.util.*;

public class Exercise6_RePlaceAWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String n = sc.nextLine();
        String oldword = sc.nextLine();
        String newword = sc.nextLine();
        n = n.replace(oldword, newword);
        System.out.println(n);
    }
}
