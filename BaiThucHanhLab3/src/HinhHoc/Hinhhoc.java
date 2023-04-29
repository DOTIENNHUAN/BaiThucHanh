package HinhHoc;

public class Hinhhoc {
    public final float PI = 3.14f;
    public String ten;
    public float chuvi;
    public float dientich;
    public float thetich;


    public float getPI(){
        return PI;
    }

    public String getTen(){
        return ten;
    }

    public void setTen(String ten){
        this.ten = ten;
    }

    public float getChuVi(){
        return chuvi;
    }

    public void setChuVi(){
        this.chuvi = chuvi;
    }

    public float getDienTich(){
        return dientich;
    }

    public void setDienTich(){
        this.dientich = dientich;
    }

    public float getTheTich(){
        return thetich;
    }

    public void setTheTich(){
        this.thetich = thetich;
    }

    public void xuatTen(){
        System.out.println("\n\n===== " + ten + "=====");
    }

    public void inChuVi(){
        System.out.println("Chu vi = " + chuvi);
    }

    public void inDienTich(){
        System.out.println("Dien tich = " + dientich);
    }

    public void inTheTich(){
        System.out.println("The tich = " + thetich);
    }
}
