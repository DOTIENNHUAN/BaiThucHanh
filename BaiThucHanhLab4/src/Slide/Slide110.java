package Slide;

import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Slide110 {
    public static void main(String[] args) {
        int number;
        ArrayList<Integer> arrListInteger = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so phan tu cua ArrayList: ");
        int n = sc.nextInt();

        //Nhap va them phan tu cho ArrayList
        for(int i = 0; i < n; i++){
            System.out.println("Nhap phan tu thu " + i + ":");
            number = sc.nextInt();
            arrListInteger.add(number);
        }
       
        //gia su phan tu dau tien trong ArrayList la phan tu lon nhat
        int max = arrListInteger.get(0);

        //neu ket qua cu phep so sanh lon hon 0
        //thi gan max = phan tu tai vi tri i va do la phan tu lon nhat
        for(int i = 1; i < arrListInteger.size(); i++){
            if(arrListInteger.get(i).compareTo(max) > 0){
                max = arrListInteger.get(i);
            }
        }

        System.out.println("Phan thu lon nhat trong arrListInteger = " + max);


        //sap xep tang dan
        System.out.println("");
        arrListInteger.sort((o1, o2) -> o1 - o2);
        System.out.print("Sap xep tang dan: ");
        for (Integer integer : arrListInteger) {
            System.out.print(integer + "\t");
        }


        //sap xep giam dan
        System.out.println("");
        arrListInteger.sort((o1, o2) -> o2 - o1);
        System.out.print("Sap xep giam dan: ");
        for (Integer integer : arrListInteger) {
            System.out.print(integer + "\t");
        }
    }

}
