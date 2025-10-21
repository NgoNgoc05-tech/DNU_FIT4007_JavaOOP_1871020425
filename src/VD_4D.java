import java.util.Scanner;

public class VD_4D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập vào số nguyên dương N
        System.out.print("Nhập vào số nguyên dương N: ");
        int N = scanner.nextInt();

        int tong = 0;

        // Tính tổng các số từ 1 đến N
        for (int i = 1; i <= N; i++) {
            tong += i;  // tong = tong + i
        }

        // In ra kết quả
        System.out.println("Tổng các số từ 1 đến " + N + " là: " + tong);

        scanner.close();
    }
}



