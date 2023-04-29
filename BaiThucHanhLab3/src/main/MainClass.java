package main;

import java.util.Scanner;

import HinhHoc.Hinhchunhat;
import HinhHoc.Hinhtron;
import HinhHoc.Hinhtrutron;
import HinhHoc.Hinhvuong;

public class MainClass{

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("1. Hinh tron \n2.Hinh tru tron \n3. Hinh chu nhat \n4.Hinh vuong \nLua chon cua ban: "); 
    int luachon = sc.nextInt();
    switch(luachon){
     
    case 1:
    //Lop Hinhtron
    Hinhtron ht = new Hinhtron();
    ht.xuatTen();
    ht.nhapBanKinh();
    ht.tinhChuVi();
    ht.tinhDienTich();
    ht.inChuVi();
    ht.inDienTich();
    break;

    case 2:
    //Lop Hinhtrutron
    Hinhtrutron htt = new Hinhtrutron();
    htt.nhapChieuCao(sc);
    htt.xuatTen();
    htt.inTheTich();
    break;

    case 3:
    //Lop Hinhchunhat
    Hinhchunhat hcn = new Hinhchunhat();
    hcn.xuatTen();
    hcn.nhapChieuDai(sc);
    hcn.nhapChieuRong(sc);
    hcn.tinhChuVi();
    hcn.tinhDienTich();
    hcn.inChuVi();
    hcn.inDienTich();
    break;

    case 4:
    //Lop Hinhvuong
    Hinhvuong hv = new Hinhvuong();
    hv.xuatTen();
    hv.nhapCanh(sc);   
    hv.tinhChuVi();
    hv.tinhDienTich();
    hv.inChuVi();
    hv.inDienTich();
    break;
    default:
        System.out.println("Vui long lua chon dung!");
 }
}
}

