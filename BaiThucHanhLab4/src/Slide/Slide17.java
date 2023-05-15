package Slide;

import java.util.ArrayList;

public class Slide17 {
    
    public static void main(String[] args){
        ArrayList<Integer> arrint = new ArrayList<>();

        arrint.add(1);
        arrint.add(2);
        arrint.add(3);

        System.out.println("Cac phan tu co trong arrint la: ");
        for (int number : arrint){
            System.out.println(number);
        }
    }
}