package Exercise2301_ArrayListExam;

import java.util.*;

public class Exercise5_RemoveAnElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            System.out.print("Nhap so thu " + (i + 1) + ": ");
            int x = sc.nextInt();
            numbers.add(x);
        }
        numbers.remove(3);
        System.out.println(numbers);
    }
}
