public class TamGiac_4A {
    private double a;
    private  double b;
    public double c;

    public TamGiac_4A(double a, double c, double b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    public double ChuVi(){
        return a + b + c;
    }
    public double DienTich(){
        double p = ChuVi() / 2;
        return Math.sqrt(p*(p-a)*(p-b)* (p - c));
    }
}
