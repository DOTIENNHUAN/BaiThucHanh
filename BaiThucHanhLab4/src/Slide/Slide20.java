package Slide;

import java.util.ArrayList;

public class Slide20 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Chó");
        arr.add("Mèo");
        arr.add("Gà");
        arr.add("Lợn");
        arr.remove("Chó");
        System.out.println(arr.get(1));
        System.out.println(arr.contains("Hổ"));
        System.out.println(arr.contains("Gà"));
        System.out.println(arr.size());
        System.out.println(arr);
    }
}