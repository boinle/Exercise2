package Lec3_Scanner;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Fullname: ");
        String ten = sc.nextLine();

        System.out.print("StudentID: ");
        int mssv = sc.nextInt();
        sc.nextLine();

        System.out.print("Hometown: ");
        String que = sc.nextLine();

        System.out.print("GPA: ");
        float gpa = sc.nextFloat();
        sc.nextLine();

        System.out.print("Mayjor: ");
        String mayjor = sc.nextLine();

        System.out.print("Scholarship: ");
        Boolean hocbong = sc.nextBoolean();
    }
}
