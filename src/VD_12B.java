public class VD_12B {
    private char ch;
    public VD_12B(char ch) {
        this.ch = ch;
    }
    public boolean laChuInHoa() {
        return ch >= 'A' && ch <= 'Z';
    }

    public static void main(String[] args) {
        VD_12B vd = new VD_12B('A');
        System.out.println(""+vd.laChuInHoa());
    }
}
