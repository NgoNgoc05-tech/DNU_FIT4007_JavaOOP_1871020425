import java.util.Scanner;

public class ViDu_9A {
    private double a;
    private double b;

    public ViDu_9A(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ViDu_9A a9 = new ViDu_9A(n);

    }
}
