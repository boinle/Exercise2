package Lec6_Arrays;

import java.util.ArrayList;

public class page8 {

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("White");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
