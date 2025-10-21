public class VD_11B {
    private char ch;

    public VD_11B(char ch) {
        this.ch = ch;
    }
    public boolean laChuInThuong() {
        return ch >= 'a' && ch <= 'z';
    }
    public static void main(String[] args) {
        VD_11B vd = new VD_11B('a');
        System.out.println(vd.laChuInThuong());
    }
}
