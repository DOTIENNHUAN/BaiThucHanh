package Slide;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;
public class Slide112 {
    public static void main(String[] args) {
        String tenSinhVien, thongTin = null;
        String arrThongTin[];   //mang luu tru thong tin sinh vien
        double diemSinhVien;

        //luu tru danh sach sinh vien
        LinkedList<String> dsSV = new LinkedList<>();

        //luu tru danh sach sinh vien thi lai
        LinkedList<String> svThiLai = new LinkedList<>();

        //luu tru danh sach sinh vien co diem cao nhat
        LinkedList<String> svDiemCao = new LinkedList<>();

        //luu tru danh sach sinh vien can tim
        LinkedList<String> svCanTim = new LinkedList<>();

        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Nhap ten sinh vien: ");
            tenSinhVien = sc.nextLine();
            
            if(!tenSinhVien.isEmpty()){
                System.out.println("Nhap diem: ");
                diemSinhVien = Double.parseDouble(sc.nextLine());
                thongTin = tenSinhVien + "\t" + diemSinhVien;
                dsSV.add(thongTin);
            }
        }while(!tenSinhVien.isEmpty());

        System.out.println("So sinh vien trong danh sach la: " + (dsSV.size()));
        System.out.println("Thong tin cua sinh vien vua nhap la: ");
        System.out.println("Ten sinh vien \t Diem ");

        Iterator<String> iterator = dsSV.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //dem so sinh vien phai thi lai
        for(int i = 0; i < dsSV.size(); i++){
            String sv = dsSV.get(i); //lay sinh vien tai vi tri i trong dsSV
            arrThongTin = sv.split("\t");  //chuyen doi chuoi sv thanh mang
            double point = Double.parseDouble(arrThongTin[1]);

            //neu point <= 5 thi them sinh vien do vao trong svThiLai
            if(point <= 5){
                svThiLai.add(sv);
            }
        }

        if(svThiLai.isEmpty()){
            System.out.println("Khong co sinh vien phai thi lai! ");
        }else{
            System.out.println("So sinh vien phai thi lai la: " + (svThiLai.size()));
            System.out.println("Thong tin cua cac sinh vien phai thi lai la: ");
            System.out.println("Ten sinh vien \t Diem");
            iterator = svThiLai.iterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }
        }

        double maxTemp = 0;  //so diem lon nhat
        int i = 0;  //chi so cua phan tu

        //tim diem lon nhat trong danh sach
        while(i < dsSV.size()){
            arrThongTin = dsSV.get(i).split("\t");

            //neu diem cua sinh vien co chi so i trong dsSV lon hon hoac bang so diem lon nhat maxTemp thi se gan maxTemp bang diem cua sinh vien do va tang i len 1 sau do quay lai vong lap while
            if(Double.parseDouble(arrThongTin[1]) >= maxTemp){
                maxTemp = Double.parseDouble(arrThongTin[1]);
            }
            i++;
        }

        //tim sinh vien co diem cao nhat
        i = 0;
        while(i < dsSV.size()){
            arrThongTin = dsSV.get(i).split("\t");

            //trong dsSV neu co sinh vien nao co so diem bang voi maxTempthi se them sinh vien do vao trong svDiemCao
            if(Double.parseDouble(arrThongTin[1]) == maxTemp){
                svDiemCao.add(dsSV.get(i));
            }
            i++;
        }

        System.out.println("Thong tin cua cac sinh vien co diem cao nhat la: ");
        System.out.println("Ten sinh vien \t Diem");
        iterator = svDiemCao.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //Tim kiem theo ten sinh vien
        System.out.println("Nhap ten sinh vien can tim: ");
        String search = sc.nextLine();

        i = 0;
        while(i < dsSV.size()){
            arrThongTin = dsSV.get(i).split("\t");
            tenSinhVien = arrThongTin[0];
            if(search.equalsIgnoreCase(tenSinhVien)){
                svCanTim.add(dsSV.get(i));
            }
            i++;
        }

        System.out.println("Thong tin cua cac sinh vien ten " + search + " : ");
        System.out.println("Ten sinh vien \t Diem");
        iterator = svCanTim.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
