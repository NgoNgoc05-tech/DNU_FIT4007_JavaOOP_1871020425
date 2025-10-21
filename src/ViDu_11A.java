import java.util.Scanner;

public class ViDu_11A {
    private int a;
    private int b;
    public ViDu_11A(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void hoanDoi() {
        int c = a; // lưu tạm giá trị a
        a = b;     // gán a bằng b
        b = c;     // gán b bằng giá trị tạm c
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
       ViDu_11A hd = new ViDu_11A(a, b);

        System.out.println("Trước khi hoán đổi: a = " + hd.getA() + ", b = " + hd.getB());

        hd.hoanDoi();

        System.out.println("Sau khi hoán đổi: a = " + hd.getA() + ", b = " + hd.getB());

    }

}
