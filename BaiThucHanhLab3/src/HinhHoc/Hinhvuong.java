package HinhHoc;

import java.util.Scanner;

public class Hinhvuong extends Hinhchunhat{
    
    public Hinhvuong(){
        ten = "Hinh vuong";
    }

    public void nhapCanh(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Canh = ");
        dai = rong = sc.nextFloat();
        sc.close();
    }
}
