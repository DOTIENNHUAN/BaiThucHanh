package Slide;

import java.util.Scanner;
import java.util.HashSet;

public class Slide113 {
    public static void main(String[] args) {
        String fruit;
        Scanner sc = new Scanner(System.in);
        HashSet<String> hashSetStr = new HashSet<>();

    //them cac loai fruit vao hashSetStr
    hashSetStr.add("Cam");
    hashSetStr.add("Tao");
    hashSetStr.add("Dua hau");
    hashSetStr.add("Nho");
    hashSetStr.add("Chuoi");

    //hien thi cac loai fruit trong hashSetStr
    System.out.println("Cac loai fruit la: ");
    System.out.println(hashSetStr);
    System.out.println("Nhap loai fruit can tim: ");
    fruit = sc.nextLine();

    if(!hashSetStr.contains(fruit)){
        hashSetStr.add(fruit);
        System.out.println("Khong tim thay!");
        
    }else{
        System.out.println("Co tim thay!");
    }

    System.out.println("Nhap fruit can xoa: ");
    fruit = sc.nextLine();

    if(hashSetStr.contains(fruit)){
        hashSetStr.remove(fruit);
        System.out.println("Xoa thanh cong! ");
        System.out.println("Cac fruit con lai la: ");
        System.out.println(hashSetStr);
    }else{
        System.out.println("Xoa khong thanh cong! ");
    }
  }
}
