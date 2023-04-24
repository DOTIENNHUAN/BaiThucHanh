package HinhHoc;
import java.util.Scanner;

public class Hinhtrutron extends Hinhtron{
    public float chieucao;

    public Hinhtrutron(){
        ten = "Hinh tru tron";
    }

    public void nhapChieuCao(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Chieu cao = ");
        chieucao = sc.nextFloat();
       
    }

    public void tinhTheTich(){
        tinhDienTich();
        thetich = dientich * chieucao;
    }
}
