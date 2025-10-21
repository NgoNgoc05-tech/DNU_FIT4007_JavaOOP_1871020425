import java.util.Scanner;

public class VD_8B {
    private double n;

    public VD_8B(double n) {
        this.n = n;
    }
    public boolean kiemtrsothuc(){
        return n  == (int) n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        VD_8B vd = new VD_8B(sc.nextDouble());
        System.out.println("" + vd.kiemtrsothuc());
    }
}
