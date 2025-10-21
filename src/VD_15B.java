public class VD_15B {
    private int h;
    private int m;

    public VD_15B(int h, int m) {
        this.h = h;
        this.m = m;
    }
    public void sauMotPhut(){
        m++;
        if(m == 60){
            m = 0;
            h++;
            if(h == 24){
                h = 0;
            }

        }
    }
    public void hienThi(){
        System.out.println("Time"+ h + m);
    }
    public static void main(String[] args) {
        VD_15B vd = new VD_15B(1,1);
        System.out.println(" "+vd.h + " "+vd.m);
        vd.sauMotPhut();
        System.out.println(" ");
        vd.hienThi();
    }
}
