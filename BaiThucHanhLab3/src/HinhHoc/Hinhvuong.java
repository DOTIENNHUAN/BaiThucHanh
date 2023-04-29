package HinhHoc;

import java.util.Scanner;

public class Hinhvuong extends Hinhchunhat{
    
    public Hinhvuong(){
       super.setTen("Hinh vuong");
    }

    public void nhapCanh(Scanner sc){
        System.out.println("Canh = ");
        super.setDai(sc.nextFloat());
        super.setRong(super.getDai());
    }
}
