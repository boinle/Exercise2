package Exercise2301;

import java.util.*;

public class Exercise12_SumOfRandomNumbers {

    public static void main(String[] args) {
        Random rd = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            int x = rd.nextInt(100) + 1;
            System.out.println("So random thu " + (i + 1) + ": " + x);
            numbers.add(x);
            sum += x;
        }
        System.out.println(numbers);
        System.out.println("Sum of Random Numbers is " + sum);
    }
}
