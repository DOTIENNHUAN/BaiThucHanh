package HinhHoc;
import java.util.Scanner;

public class Hinhtron extends Hinhhoc{
    public float bankinh;
    
    public Hinhtron(){
        ten = "Hinh tron";
    }

    public void nhapBanKinh(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ban kinh = ");
        bankinh = sc.nextFloat();
       
    }

    public void tinhChuVi(){
        chuvi = 2 * PI * bankinh;
    }

    public void tinhDienTich(){
        dientich = PI * bankinh * bankinh;
    }
}

    