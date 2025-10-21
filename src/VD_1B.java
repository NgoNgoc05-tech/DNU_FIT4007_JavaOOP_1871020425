import java.util.Scanner;

public class VD_1B {
    private int a;

    public VD_1B(int a) {
        this.a = a;
    }

    public boolean laSoTuNhien(){
        return a >= 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        VD_1B vd = new VD_1B(a);
        System.out.println(""+ vd.laSoTuNhien());
    }
}
