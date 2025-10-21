import java.util.Scanner;

public class ViDu_1A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int tong =  a + b;
        System.out.println("Tong la: " + tong);
        int hieu =  a - b;
        System.out.println("Hieu la: " + hieu);
        int tich  =  a * b;
        System.out.println("Tich la: " + tich);
        float chia = (float)a/b;
        System.out.println("Chia la: " + chia);

    }
}
