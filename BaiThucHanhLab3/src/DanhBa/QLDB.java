package DanhBa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLDB implements Function{
    List<Contact> list = new ArrayList<>();

    public QLDB(){

    }

    @Override
    public void Nhapthongtin(Scanner sc){
        while(true){
            System.out.println("Nhap ten: ");
            String Ten = sc.nextLine();
            System.out.println("Nhap Sdt: ");
            String Sodienthoai = sc.nextLine();
            Contact contact = new Contact(Ten, Sodienthoai);
            list.add(contact);

            System.out.println("Nhap A de nhap tiep, Nhap B de ve Menu: ");
            String chon = sc.nextLine();
            if(chon.equalsIgnoreCase("B")){
                break;
            }
        }
    }

    @Override
    public void Capnhat(Scanner sc){
        System.out.println("Vui long nhap ten can cap nhat: ");
        String chon = sc.nextLine();
        Contact tim = null;
        for(Contact contact : list){
            if(contact.getTen().contains(chon)){
                tim = contact;
                break;
            }
        }

        if(tim == null){
            System.out.println("Khong tim thay, vui long nhap lai: ");
            Nhapthongtin(sc);
        }else{
            System.out.println("Cap nhat so dien thoai: ");
            tim.setSodienthoai(sc.nextLine());
            System.out.println("Da cap nhat so dien thoai!");
            System.out.println("");
        }
    }

    @Override
    public void Xoa(Scanner sc){
        System.out.println("Vui long nhap ten can xoa: ");
        String chon = sc.nextLine();
        Contact tim = null;
        for(Contact contact : list){
            if(contact.getTen().contains(chon)){
                tim = contact;
                break;
            }
        }
        if(tim == null){
            System.out.println("Khong tim thay!");
        }else{
            list.remove(tim);
            System.out.println("Da xoa thanh cong!");
        }
    }
    @Override
    public void Timkiem(Scanner sc){
        System.out.println("Vui long nhap ten can tim: ");
        String chon = sc.nextLine();
        Contact tim = null;
        for(Contact contact : list){
            if(contact.getTen().contains(chon));
            tim = contact;
            break;
        }
    
    
    if(tim == null){
        System.out.println("Khong tim thay!");
    }else{
        System.out.println("Thong tin ban tim la: ");
        tim.Inthongtin();
    }
}
}


