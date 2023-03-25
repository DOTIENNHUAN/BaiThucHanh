import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Hinhtron ht = new Hinhtron();
        Student sd = new Student();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("1. Hinh tron\n2. Student\nLua chon cua ban: "); int luachon = sc.nextInt();
        switch(luachon){
            case 1:
                ht.nhapBanKinh();
                ht.tinhChuVi();
                ht.tinhDienTich();
                ht.inKetQua();
                break;
            case 2:
                sd.nhapThongtin();
                sd.tinhTuoi();
                sd.inThongtin();
                break;
            default:
                System.out.println("Vui long lua chon dung!");
        }
    sc.close();
    }
}