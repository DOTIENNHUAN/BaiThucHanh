import java.util.Scanner;

public class Bai8{

    public static void main(String[] args){
    int n, a, tong = 0;
    float trungbinhcong;
    Scanner sc = new Scanner(System.in);
    
    System.out.println("nhap vao day so: ");
    n = sc.nextInt();

    for(int count = 1; count <= n; count++ ){
        System.out.println("Nhap so thu " + count + ":");
        a = sc.nextInt();
        tong += a;
    }
    trungbinhcong = (float) tong / n;
    System.out.println("trungbinhcong = " + trungbinhcong);
    }
}    