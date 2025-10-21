import java.util.Scanner;

public class VD_3C {
    public static  void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char ch = sc.next().charAt(0);
        String gioiTinh;
        switch(ch){
            case 'N':
                gioiTinh = "nam";
                break;
            case 'S':
                gioiTinh="Bắc";
                break;
            case 'M':
                gioiTinh="Tâyy";
                break;
            default:
                gioiTinh="Nhap NMSde kiem tra";

        }
        System.out.println(gioiTinh);
    }
}
