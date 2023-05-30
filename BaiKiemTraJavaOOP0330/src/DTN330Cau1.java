import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;

public class DTN330Cau1 {
    public String Hoten;
    public int Tuoi;
    public float Diem;

    Scanner sc = new Scanner(System.in);
    
    public void EnterData(ArrayList<DTN330Cau1> arrList, Scanner sc){
        System.out.println("Nhap Ho ten: ");
        this.Hoten = sc.nextLine();
        System.out.println("Nhap Tuoi: ");
        this.Tuoi = sc.nextInt();
        System.out.println("Nhap Diem: ");
        this.Diem = sc.nextFloat();
    }

    public void Insert(ArrayList<DTN330Cau1> arrList, Scanner sc){

    }

    public void Update(){

    }

    public void Delete(){

    }

    public void Display(){

    }

    public void SearchByName(){

    }

}
