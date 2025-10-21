import java.util.Scanner;

public class ViDu_6A {
    private int n;

    public ViDu_6A(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    public int laySoCuoi(){
        return Math.abs(n%10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ViDu_6A v = new ViDu_6A(n);
        System.out.println("" + v.laySoCuoi());
    }
}
