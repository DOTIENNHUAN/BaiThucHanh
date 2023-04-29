import java.util.ArrayList;
import java.util.Scanner;

public class Slide22{
    public static void main(String[] args){
        ArrayList<Integer> arrint = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.println("Nhap so phan tu cua ArrayList: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println("Nhap phan tu thu " + i + ": ");
            number = sc.nextInt();
            arrint.add(number);
        }

        int max = arrint.get(0);

        for(int i = 1; i < arrint.size(); i++){
            if(arrint.get(i).compareTo(max) > 0){
                max = arrint.get(i);
            }
        }

        System.out.println("Phan tu lon nhat trong arrint = " + max);
    }
}