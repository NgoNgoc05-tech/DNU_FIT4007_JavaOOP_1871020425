public class VD_13B {
    private String a;
    private  String b;
    public VD_13B(String a, String b) {
        this.a = a;
        this.b = b;
    }
    public boolean GiongNhau(){
        return a.equals(b);
    }
    public static void main(String[] args) {
        VD_13B vd = new VD_13B("a","a");
        System.out.println(vd.GiongNhau());
    }
}
