import java.util.Scanner;

public class VD_12 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean soNguyenTo =  true;

        if(n <= 1){
            soNguyenTo = false;

        }
        else {
            for(int i=2;i*i<=n;i++){
                if(n%i==0){
                    soNguyenTo = false;
                    break;
                }
            }
        }
        if(soNguyenTo){
            System.out.println( "dung "+ n);

        }
        else{
            System.out.println( "sai "+ n);
        }
    }
}
