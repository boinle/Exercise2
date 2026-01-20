package Exercise;

import java.util.Scanner;

public class chiahet3va5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        boolean find = false;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
                find = true;
            }
        }
        if (!find) {
            System.out.println("Khong co so chia het cho 3 va 5");
        }
    }
}
