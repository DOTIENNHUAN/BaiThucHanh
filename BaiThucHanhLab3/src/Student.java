import java.util.Scanner;

public class Student{
    
    //nhap cac thuoc tinh
    String hoten;
    int namsinh, tuoi;
    String diachi;

    //nhap cac phuong thuc
 public void nhapThongtin(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap ho ten: ");
    hoten = sc.nextLine();
    System.out.println("Nhap nam sinh: ");
    namsinh = sc.nextInt();
    System.out.println("Nhap dia chi: ");
    diachi = sc.next();
    sc.close();
 }
 public void tinhTuoi(){
    tuoi = 2023 - namsinh;
    System.out.printf("Tuoi cua sinh vien la: %d", tuoi);
 }
 public void inThongtin(){
    System.out.printf("\nThong tin cua sinh vien la: \nhoten: %s \nnamsinh: %d \ndiachi: %s \ntuoi: %d ", hoten, namsinh, diachi, tuoi);
 }
}