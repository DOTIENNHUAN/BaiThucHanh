import java.util.Scanner;

public class Bai3{

    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       String hoten;
       int namsinh;
       
       System.out.println("Nhap vao ho ten: ");
       hoten = sc.nextLine();
       System.out.println("Nhap vao nam sinh: ");
       namsinh = sc.nextInt();
       int tuoi;
       tuoi = 2023 - namsinh;
       System.out.printf("So tuoi cua ban la: %d", tuoi);
       

       if(tuoi < 16){
        System.out.println("Ban" + " " +hoten+ " " +  "o tuoi vi thanh nien");}
        if(16 <= tuoi & tuoi < 18){
            System.out.println("Ban" + " " +hoten+ " " + "o do tuoi truong thanh");}
        if(tuoi >= 18){
            System.out.println("Ban" + " " +hoten+ " " + "da gia");} 
    
    }
}