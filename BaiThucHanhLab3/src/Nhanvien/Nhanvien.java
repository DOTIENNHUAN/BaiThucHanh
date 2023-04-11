package Nhanvien;
import java.util.Scanner;


public class Nhanvien{
    //nhap cac thuoc tinh
    String hotennv;
    int manhanvien;
    int tuoi;
    float luong;
    float hesoluong;
    final int luongcoban = 1490000;

    //nhap cac phuong thuc
public void nhapThongTin(){
   Scanner sc = new Scanner(System.in);
   System.out.println("Nhap thong tin nhan vien: ");
   hotennv = sc.nextLine();
   System.out.println("Nhap tuoi: ");
   tuoi = sc.nextInt();
   System.out.println("Nhap ma nhan vien: ");
   manhanvien = sc.nextInt();
   System.out.println("Nhap he so luong: ");
   hesoluong = sc.nextFloat();
   sc.close();
   }

public void tinhLuong(){
    luong = hesoluong * luongcoban;
}

public void inThongTin(){
    System.out.printf("Thong tin cua nhan vien tren la: \nhoten: %s \ntuoi: %d \nmanhanvien: %d \nhesoluong: %f \nluong = %f", hotennv, tuoi, manhanvien, hesoluong, luong);
}
}