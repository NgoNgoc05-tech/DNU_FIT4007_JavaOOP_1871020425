import java.util.Scanner;

public class VD_8E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Mảng không hợp lệ!");
            return;
        }
        int[]  arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max= arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int a = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] == max) {
                a++;
            }
        }
        System.out.println(a);
        System.out.println(max);
        }

    }

