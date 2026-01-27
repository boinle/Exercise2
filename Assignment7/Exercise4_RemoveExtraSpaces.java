package Assignment7;

import java.util.Scanner;

public class Exercise4_RemoveExtraSpaces {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input : ");
        String n = sc.nextLine();
        String result = "";
        boolean space = false;
        for (int i = 0; i < n.length(); i++) {
            char c = n.charAt(i);
            if (c != ' ') {
                result += c;
                space = false;
            } else {
                if (!space) {
                    result += ' ';
                    space = true;
                }
            }
        }
        result = result.trim();
        System.out.println(result);
    }
}
