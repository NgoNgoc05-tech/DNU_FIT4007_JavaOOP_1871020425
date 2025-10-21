import java.util.Scanner;

public class VD_4C {
    private int a;
    private int b;
    private char phepTinh;

    public VD_4C(int a, char phepTinh, int b) {
        this.a = a;
        this.phepTinh = phepTinh;
        this.b = b;
    }
    public void TinhToan(){
        double kq;

        switch (phepTinh) {
            case '+':
                kq=a+b;
                System.out.println(kq);
                break;
            case '-':
                kq=a-b;
                System.out.println(kq);
                break;
            case '*':
                kq=a*b;
                System.out.println(kq);
                 break;
            case '/':
                kq=a/b;
                System.out.println(kq);
                break;
            default:
                System.out.println(" Nhập +_*/");
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        char phepTinh=sc.next().charAt(0);

        VD_4C vd=new VD_4C(a,phepTinh,b);
        vd.TinhToan();
    }
 }
