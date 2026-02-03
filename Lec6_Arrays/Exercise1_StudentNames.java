package Lec6_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise1_StudentNames {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        String sv1 = sc.nextLine();
        String sv2 = sc.nextLine();
        String sv3 = sc.nextLine();
        String sv4 = sc.nextLine();
        String sv5 = sc.nextLine();
        names.add(sv1);
        names.add(sv2);
        names.add(sv3);
        names.add(sv4);
        names.add(sv5);
        for (String name : names) {
            System.out.println(name);
        }
    }
}
