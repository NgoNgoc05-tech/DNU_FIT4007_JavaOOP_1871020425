import java.util.Scanner;

public class ViDu_3A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        double p = 2 * ( a + b );
        System.out.println("" + p);
        double s = a * b;
        System.out.print("" + s);
    }
}
