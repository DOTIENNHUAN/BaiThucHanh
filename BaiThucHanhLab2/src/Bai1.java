import java.util.Scanner;

public class Bai1{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float m, n;
        System.out.println("Nhap gia tri m: ");
        m = sc.nextFloat();
        System.out.println("Nhap gia tri n: ");
        n = sc.nextFloat();

        float a = m + n;
        System.out.printf("Tong cua 2 so la: " +m+  "+" +n+" = " +a );
        float a = m - n;
        System.out.printf("\nHieu cua 2 so la: " +m+ "-" +n+ "="+a );
        float a = m * n;
        System.out.printf("\nTich cau 2 so la: " +m+ "*" +n+ "="+a );
        float a = m / n;
        System.out.printf("\nThuong cua 2 so la: " +m+ "/" +n+ "="+a );

        System.out.printf("\nPhan du cua 2 so la: ");

        if(m > n){
            System.out.println("m > n");
        if(m < n ){
            System.out.println("m < n");
        if(m == n){
            System.out.println("m == n");
                }
            }
        }
    }
}
