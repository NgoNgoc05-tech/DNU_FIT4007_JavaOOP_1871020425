import java.util.Scanner;

public class VD_5C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap Nam"
        );
        int n=sc.nextInt();
        System.out.println("Nhap Thang"
        );
        int t=sc.nextInt();

        int ng;
        switch (t){
            case 1: case 3: case 5:case 7:case 8:case 10:case 12:
                ng = 31;
                break;

            case 4: case 6:case 9:case 11:
                ng = 30;
                break;
            case 2:
                if ((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0))
                    ng = 29;
                else
                    ng = 28;
                break;
            default:
                System.out.println("loi");
                return;
        }
        System.out.println("" + ng + t + n );
    }
}
