
package Lec5_Loops;
import java.util.Scanner;
public class Example5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int number = 1;
        while(number != 0){
            System.out.print("Enter a number (0 to quit) : ");
            number = sc.nextInt();
            sum += number;
        }
        System.out.println("The total is " + sum);
    }
}
