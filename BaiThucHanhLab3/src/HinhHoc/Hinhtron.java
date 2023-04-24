package HinhHoc;
import java.util.Scanner;

public class Hinhtron extends Hinhhoc{
    
    public Hinhtron(){
        ten = "Hinh tron";
    }
    
    private final float PI = 3.14f;
    private float bankinh;

    public float getBanKinh(){
        return bankinh;
    }

    public void setBanKinh(float r){
        this.bankinh = r;
    }

    public void tinhChuVi(){
        chuvi = 2 * PI * bankinh;
    }

    public void tinhDienTich(){
        dientich = PI * bankinh * bankinh;
    }
}

    