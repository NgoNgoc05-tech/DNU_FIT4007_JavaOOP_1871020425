import java.util.Scanner;

public class VD_6E {
    public static void  main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0){
            System.out.println("Loi");
        }
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(arr[0]);
        System.out.println(arr[n-1]);
    }
}
