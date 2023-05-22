package Slide;

import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.Scanner;

public class Slide111 {
    public static void main(String[] args) {
        int n;
        int node;
        int sum = 0;
        int count = 0;
        double TBCong;

        DecimalFormat dcf = new DecimalFormat("#.##");
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> linkedList = new LinkedList<>();

        System.out.println("Nhap so phan tu cua danh sach LinkedList: ");
        n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println("Nhap vao phan tu thu " + i + " : ");
            node = sc.nextInt();
            linkedList.add(node);
        }

        for(int i = 0; i < n; i++){
            if(linkedList.get(i) % 2 == 0){
                sum += linkedList.get(i);
                count++;
            }
        }

        TBCong = (double)sum / count;
        System.out.println("Trung binh cong cua cac so chan trong danh sach LinkedList = " + dcf.format(TBCong));
    }
}
