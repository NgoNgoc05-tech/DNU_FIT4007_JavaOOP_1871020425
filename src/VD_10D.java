import java.util.Scanner;
public class VD_10D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N;

        // Nhập số nguyên dương N từ 1 đến 9
        do {
            System.out.print("Nhập số nguyên dương N (1 <= N <= 9): ");
            N = scanner.nextInt();
            if (N < 1 || N > 9) {
                System.out.println("Giá trị không hợp lệ! Vui lòng nhập lại.");
            }
        } while (N < 1 || N > 9);

        // In bảng cửu chương
        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + (N * i));
        }

        scanner.close();
    }
}
