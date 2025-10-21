import java.util.Scanner;

public class ViDu_7A {
    private int n;

    public ViDu_7A(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    public double laySoGanCuoi() {
        return Math.abs((n/10) %10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ViDu_7A viDu_7A = new ViDu_7A(n);
        System.out.println(""+viDu_7A.laySoGanCuoi());
    }
}
