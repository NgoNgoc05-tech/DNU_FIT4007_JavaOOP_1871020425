import java.util.Scanner;

public class VD_3B {
    private int n;

    public VD_3B(int n) {
        this.n = n;
    }
    public boolean laSoChan() {
        return n % 2 == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        VD_3B vd = new VD_3B(n);
        System.out.println(""+vd.laSoChan());
    }
}
