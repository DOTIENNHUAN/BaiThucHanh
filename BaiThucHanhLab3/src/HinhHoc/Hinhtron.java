package HinhHoc;
import java.util.Scanner;

public class Hinhtron extends Hinhhoc{
    
    private float bankinh;

    public Hinhtron(){
        super.setTen("Hinh tron");
    }

    public float getBanKinh(){
        return bankinh;
    }

    public void setBanKinh(float bankinh){
        this.bankinh = bankinh;
    }

    public void nhapBanKinh(Scanner sc){
        System.out.println("Ban kinh = ");
        setBanKinh(sc.nextFloat());
    }
    
    public void tinhChuVi(){
        chuvi = 2 * bankinh * super.getPI();
        super.setChuVi(chuvi);
    }

    public void tinhDienTich(){
        dientich =super.getPI() * bankinh * bankinh;
        super.setDienTich(dientich);
    }
}

    