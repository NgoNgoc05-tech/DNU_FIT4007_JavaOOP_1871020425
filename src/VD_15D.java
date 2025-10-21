import java.util.Scanner;

public class VD_15D {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tog = 0;
        for (int i = 0 ; i < n ; i++){
            tog += i * (i + i);
        }
        System.out.println(tog);
    }
}
