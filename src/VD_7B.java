import java.util.Scanner;

public class VD_7B {
    private int a,b,c;

    public VD_7B(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public boolean laTamGiac() {
        return (a > 0 && b > 0 && c > 0) && (a + b + c == 180);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        VD_7B vd = new VD_7B(a, b, c);
        System.out.println("" + vd.laTamGiac());
    }
}
