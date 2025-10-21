public class VD_10B {
    private int a, b, c ;

    public VD_10B(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public boolean kiemTraUocVaBoi() {
        return (a % b == 0) && (b % c == 0);
    }

    public static void main(String[] args) {
        VD_10B vd = new VD_10B(1, 2, 3);
        System.out.println(vd.kiemTraUocVaBoi());
    }
}
