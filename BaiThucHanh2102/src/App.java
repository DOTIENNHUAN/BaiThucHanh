import java.util.Scanner;

class App {
    public static void main(String[] args) {
        int n, tong = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Nhap vao so nguyen duong: ");
        n = in.nextInt();

        while (n <= 0){
            System.out.println("Vui long nhap so lon hon 0!");
            n = in.nextInt();
        }

        do {
            tong = tong + n % 10;
            n = n / 10;
        } while (n >0);
        System.out.println("Tong day so la: " + tong);
    }
}
