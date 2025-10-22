import java.util.Scanner;

public class VD_5E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] q = new int[n];
        for (int i = 0; i < n; i++) {
            q[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if(i % 2 != 0 || q[i] % 2 == 0){
            sum += q[i];}
        }
        System.out.println(sum);
    }
}
