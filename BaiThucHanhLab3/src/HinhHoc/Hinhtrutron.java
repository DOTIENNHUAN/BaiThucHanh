package HinhHoc;
import java.util.Scanner;

public class Hinhtrutron extends Hinhtron{
    public float chieucao;

    public Hinhtrutron(){
        super.setTen("Hinh tru tron");
    }

    public float getChieuCao(){
        return chieucao;
    }

    public void setChieuCao(float chieucao){
        this.chieucao = chieucao;
    }

    public void nhapChieuCao(Scanner sc){
        System.out.println("Chieu cao = ");
        setChieuCao(sc.nextFloat());
       
    }

    public void tinhTheTich(Scanner sc){
        tinhDienTich();
        thetich = dientich * chieucao;
        
    }
}
