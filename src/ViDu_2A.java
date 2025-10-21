import java.util.Scanner;

public class ViDu_2A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();

        double chuvi = 2*Math.PI*a;
        double dientich = Math.PI*a*a;

        System.out.println("Chu vi: "+chuvi);
        System.out.println("Dient ich: "+dientich);
    }
}
