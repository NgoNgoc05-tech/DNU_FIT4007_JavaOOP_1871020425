import java.util.Scanner;

public class VD_4B {
    private int a;
    private int b;

    public VD_4B(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int timSoLon() {
        if (a > b) {
            return a;
        }else  {
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        VD_4B vd = new VD_4B(a, b);
        System.out.println("" + vd.timSoLon());
    }
}
