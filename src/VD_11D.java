import java.util.Scanner;

public class VD_11D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập vào số nguyên dương N
        System.out.print("Nhập vào số nguyên dương N: ");
        int N = scanner.nextInt();

        System.out.println("Các ước số của " + N + " là:");

        // Duyệt từ 1 đến N để tìm ước số
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) { // nếu chia hết thì i là ước
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
