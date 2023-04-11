package HinhHoc;

import java.util.Scanner;

public class Hinhchunhat extends Hinhhoc{
    public float dai;
    public float rong;

    public Hinhchunhat(){
        ten = "Hinh chu nhat";
    }

    public void nhapChieuDai(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Chieu dai = ");
        dai = sc.nextFloat();
      
    }

    public void nhapChieuRong(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Chieu rong = ");
        rong = sc.nextFloat();
     
    }

    public void tinhChuVi(){
        chuvi = ( dai + rong ) * 2; 
    }

    public void tinhDienTich(){
        dientich = dai * rong;
    }
}
    