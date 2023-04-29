package HinhHoc;

import java.util.Scanner;

public class Hinhchunhat extends Hinhhoc{
    private float dai;
    private float rong;
    private Scanner sc;


    public float getDai(){
        return dai;
    }

    public void setDai(float dai){
        this.dai = dai;
    }

    public float getRong(){
        return rong;
    }

    public void setRong(float rong){
        this.rong = rong;
    }

    public Hinhchunhat(){
        super.setTen("Hinh chu nhat");
    }

    public void nhapChieuDai(Scanner sc){
        System.out.println("Chieu dai = ");
        setDai(sc.nextFloat());
      
    }

    public void nhapChieuRong(Scanner sc){
        System.out.println("Chieu rong = ");
        setRong(sc.nextFloat());
     
    }

    public void tinhChuVi(){
        float chuvi = ( dai + rong ) * 2; 
        setChuVi(sc.nextFloat());
    }

    public void tinhDienTich(){
        float dientich = dai * rong;
        setDienTich(sc.nextFloat());
    }
}
    