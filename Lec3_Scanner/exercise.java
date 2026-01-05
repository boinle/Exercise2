package Lec3_Scanner;

import java.util.Scanner;

public class exercise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho va ten: ");
        String ten = sc.nextLine();
        System.out.print("Nhap ma so sinh vien: ");
        int mssv = sc.nextInt();
        System.out.println("Ho va ten: " + ten);
        System.out.println("Ma so sinh vien : " + mssv);
    }

}
