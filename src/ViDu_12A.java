import java.util.Scanner;

public class ViDu_12A {
    private int a;
    private int b;
    public ViDu_12A(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void hoanDoi() {
        a = a + b;
        b = a - b;
        a = a - b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        ViDu_12A vd = new ViDu_12A(a, b);
        System.out.println("Trước khi hoán đổi: a = " + vd.getA() + ", b = " + vd.getB());

        vd.hoanDoi();

        System.out.println("Sau khi hoán đổi: a = " + vd.getA() + ", b = " + vd.getB());
    }
}
