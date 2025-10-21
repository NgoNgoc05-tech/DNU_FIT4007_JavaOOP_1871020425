import java.util.Scanner;

public class VD_6D {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int tong = 0, s = 0;
        while(tong + ( s +1 )<= n){
            s++;
            tong += s;
        }
        System.out.println(s);
    }
}
