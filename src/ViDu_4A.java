import java.util.Scanner;

public class ViDu_4A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        TamGiac_4A d = new TamGiac_4A(a,b,c);
        System.out.println("" + d.DienTich());
    }
}
