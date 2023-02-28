import java.util.Scanner;

public class Slide40 
{
    public static void main(String[] args){
    int ngay;
    Scanner nhap = new Scanner(System.in);

    System.out.println("Nhap so ngay trong tuan: ");
    ngay = nhap.nextInt();
    switch(ngay){
        case 0:
            System.out.println("Hom nay la chu nhat! ");
            break;
        case 1:
            System.out.println("Hom nay la thu hai! ");
            break;
        case 2:
            System.out.println("Hom nay la thu ba! ");
            break;
        case 3:
            System.out.println("Hom nay la thu tu! ");
            break;
        case 4:
            System.out.println("Hom nay la thu nam! ");
            break;
        case 5: 
            System.out.println("Hom nay la thu sau! ");
            break;
        case 6: 
            System.out.println("Hom nay la thu bay! ");
            break;
        default:
            System.out.println("Ngay nhap khong hop le! ");
    }
    }
}