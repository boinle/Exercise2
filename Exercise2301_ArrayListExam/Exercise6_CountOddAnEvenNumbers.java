package Exercise2301_ArrayListExam;

import java.util.*;

public class Exercise6_CountOddAnEvenNumbers {

    public static void main(String[] args) {
        Random rd = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            int x = rd.nextInt(50) + 1;
            System.out.println("So thu " + (i + 1) + " la: " + x);
            numbers.add(x);
        }
        int demChan = 0;
        int demLe = 0;
        for (int i = 0; i < 15; i++) {
            if (numbers.get(i) % 2 == 0) {
                demChan++;
            } else {
                demLe++;
            }
        }
        System.out.println("Co " + demChan + " so chan va " + demLe + " so le");
    }
}
