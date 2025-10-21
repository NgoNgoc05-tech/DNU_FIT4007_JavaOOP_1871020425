import java.util.Scanner;

public class VD_7D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        do {
            System.out.println("n");
            n = sc.nextInt();
            if(n <= 0 ){
                System.out.println("sai");
            }

        }
        while(n>0);
        System.out.println("dung "+ n);

    }
}
