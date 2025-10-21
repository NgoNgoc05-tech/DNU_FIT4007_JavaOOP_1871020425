import java.util.Scanner;

public class VD_2C {
    public static  void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();// 1 2 3
        String gioiTinh;
        switch(n){
            case 0:
                gioiTinh = "nam";
                break;
            case 1:
                gioiTinh="nu";
                break;
            case 2:
                gioiTinh="khác";
                break;
            default:
                gioiTinh="Nhap 1 2 3 de kiem tra";

        }
        System.out.println(gioiTinh);
    }
}
