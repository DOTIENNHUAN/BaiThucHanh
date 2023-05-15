package Slide;

import java.util.ArrayList;
import java.util.Iterator;
public class Slide18 {
    
    public static void main(String[] args){
        ArrayList<String> arrst = new ArrayList<>();

        arrst.add("Ba");
        arrst.add("Me");
        arrst.add("Con cai");

        Iterator<String> iterator = arrst.iterator();

        System.out.println("cac phan tu co trong arrst la: ");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}