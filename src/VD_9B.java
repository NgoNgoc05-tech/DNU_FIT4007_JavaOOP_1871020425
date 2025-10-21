public class VD_9B {
    private int n;

    public VD_9B(int n) {
        this.n = n;
    }
    public boolean laSoChinhPhuong() {
        if (n <= 0) return false; // chỉ xét số nguyên dương

        double can = Math.sqrt(n);
        return can == (int) can;  // nếu căn là số nguyên thì n là số chính phương
    }
    public static void main(String[] args) {
        VD_9B vd = new VD_9B(4);
        if (vd.laSoChinhPhuong()) {
            System.out.println( " là số chính phương.");
        } else {
            System.out.println(  " không phải là số chính phương.");
        }
    }
}
