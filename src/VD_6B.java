import java.util.Scanner;

public class VD_6B {
    private int a, b, c;


    public VD_6B(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public boolean laTamGiac() {
        return (a > 0 && b > 0 && c > 0) &&
                (a + b > c) &&
                (a + c > b) &&
                (b + c > a);
    }

    // Hàm main để chạy chương trình
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập cạnh a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập cạnh b: ");
        int b = scanner.nextInt();

        System.out.print("Nhập cạnh c: ");
        int c = scanner.nextInt();

         VD_6B VtamGiac = new VD_6B(a, b, c);

        if (VtamGiac.laTamGiac()) {
            System.out.println(" Ba cạnh trên tạo thành một tam giác hợp lệ.");
        } else {
            System.out.println(" Ba cạnh trên KHÔNG tạo thành tam giác.");
        }
    }
}