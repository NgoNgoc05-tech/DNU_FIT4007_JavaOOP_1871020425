public class VD_14B {
    private String a;
    private  String b;
    public VD_14B(String a, String b) {
        this.a = a;
        this.b = b;
    }
    public String ChuoiDaiHon(){
        if(a.length()>b.length()){
            return a;
        }else if(a.length()<b.length()){
            return b;
        }
        else {
            return a;
        }
    }
    public static void main(String[] args) {
        VD_14B vd = new VD_14B("ancutcanai","hehe");
        System.out.println(vd.ChuoiDaiHon());
    }
}
