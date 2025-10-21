import java.util.Scanner;

public class VD_13D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số tự nhiên N
        System.out.print("Nhập số tự nhiên N: ");
        int N = scanner.nextInt();

        int tong = 0;
        int temp = N; // lưu tạm N để xử lý

        // Tách các chữ số và cộng dồn
        while (temp > 0) {
            int chuSo = temp % 10; // lấy chữ số cuối
            tong += chuSo;         // cộng vào tổng
            temp = temp / 10;      // loại bỏ chữ số cuối
        }

        // In kết quả
        System.out.println("Tổng các chữ số của " + N + " là: " + tong);

        scanner.close();
    }
}
