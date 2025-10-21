import java.util.Scanner;

import java.util.Scanner;

public class VD_8D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập vào số nguyên dương N
        System.out.print("Nhập vào số nguyên dương N: ");
        int N = sc.nextInt();

        boolean laLuyThuaCua2 = true;

        // Kiểm tra N có phải là lũy thừa của 2 hay không
        if (N <= 0) {
            laLuyThuaCua2 = false;
        } else {
            while (N > 1) {
                if (N % 2 != 0) { // Nếu chia cho 2 mà dư thì không phải
                    laLuyThuaCua2 = false;
                    break;
                }
                N = N / 2;
            }
        }

        // In kết quả
        if (laLuyThuaCua2) {
            System.out.println("Đây là lũy thừa của 2.");
        } else {
            System.out.println("Đây KHÔNG phải là lũy thừa của 2.");
        }


    }
}