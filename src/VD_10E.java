import java.util.Scanner;

public class VD_10E {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Mảng không hợp lệ!");
            return;
        }

        // Khai báo mảng
        int[] a = new int[n];

        // Nhập các phần tử của mảng
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        boolean so = false;
        for (int i = 0; i < n; i++) {
            if (a[i] % 5 == 0){
                so = true;
            }
        }
        if (!so) {
            System.out.println("khong co");

        }
        else  {
            System.out.println(so);
        }
    }
}
