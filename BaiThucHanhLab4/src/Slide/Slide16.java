package Slide;

import java.util.ArrayList;

public class Slide16 {

    public static void main(String[] args){
        ArrayList<Float> arr = new ArrayList<>();

        arr.add(3.14f);
        arr.add(2.34f);
        arr.add(4.24f);
        
        System.out.println("Cac phan tu co trong arr la: ");
        for(int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i));
        }
    }
}