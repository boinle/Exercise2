
package Lec3_Scanner;

import java.util.Scanner;
public class Example4_Stringoneline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a multi-word sentence: ");
        String sentence = sc.nextLine();
        System.out.println(sentence);
        System.out.println("Enter a one word string: ");
        String s = sc.next();
        System.out.println(s);
    }
}
