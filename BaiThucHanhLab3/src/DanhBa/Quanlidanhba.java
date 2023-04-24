package DanhBa;

import java.util.Scanner;

public class Quanlidanhba {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        QLDB qldb = new QLDB();

        do{
            System.out.println("===Quan ly danh ba===");
            System.out.println("1. Tao mot lien he moi");
            System.out.println("2. Cap nhat mot lien he");
            System.out.println("3. Xoa mot lien he");
            System.out.println("4. Tim kiem mot lien he");
            System.out.println("Moi ban lua chon: ");
            String chon = sc.nextLine();

            switch(chon){
                case "1":
                System.out.println("===Nhap thong tin===");
                qldb.Nhapthongtin(sc);
                System.out.println("");
                break;

                case "2":
                System.out.println("===Cap nhat lien he===");
                qldb.Capnhat(sc);
                System.out.println("");
                break;

                case "3":
                System.out.println("===Xoa lien he===");
                qldb.Xoa(sc);
                System.out.println("");
                break;

                case "4":
                System.out.println("===Tim kiem lien he===");
                qldb.Timkiem(sc);
                System.out.println("");
                break;

                default:
                System.out.println("Vui long nhap lai!");
                System.out.println("");
                break;
            }
        }while(true);
    }
}
