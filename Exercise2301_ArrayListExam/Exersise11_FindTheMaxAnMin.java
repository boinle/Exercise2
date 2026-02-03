package Exercise2301_ArrayListExam;

import java.util.*;

public class Exersise11_FindTheMaxAnMin {

    public static void main(String[] args) {
        Random rd = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int x = rd.nextInt(100) + 1;
            System.out.println("So random thu " + (i + 1) + ": " + x);
            numbers.add(x);
        }
        int max = numbers.get(0);
        for (int i = 0; i < 10; i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }
        System.out.println("The Maximun is " + max);
        int min = numbers.get(0);
        for (int i = 0; i < 10; i++) {
            if (numbers.get(i) < min) {
                min = numbers.get(i);
            }
        }
        System.out.println("The Minimum is " + min);
    }
}
