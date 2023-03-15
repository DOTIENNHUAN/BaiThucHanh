import java.util.Scanner;

public class Bai6{

    public static void main(String[] args){
    int a, temp = 1;
    long giaithua = 1;
    Scanner sc = new Scanner(System.in);
    
    do{
        System.out.println("Nhap so nguyen duong: ");
        a = sc.nextInt();   
}while((a <= 0) || (a > 10));

while(temp <= a){
    giaithua *= temp;
    temp++;
}
System.out.println(a + "! = " + giaithua);
}
}