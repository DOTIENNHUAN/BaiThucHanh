import java.util.Scanner;

public class Slide47
{
    public static void main(String[] args){
        int a, tong = 0;
        Scanner nhap = new Scanner(System.in);

    do{
        System.out.println("Nhap vao so nguyen: ");
        a = nhap.nextInt();
        tong = tong + a;

    }while(tong < 100);
    System.out.println("Tong cac so vua nhap: " + tong);

    }
}