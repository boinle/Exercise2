package Exercise2301;

import java.util.*;

public class Exercise2_UpdateAnElement {

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Xanh");
        colors.add("Do");
        colors.add("Tim");
        colors.add("Vang");
        colors.add("Hong");
        colors.set(1, "Vang");
        System.out.println(colors);
    }
}
