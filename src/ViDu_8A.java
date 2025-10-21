import java.util.Scanner;

public class ViDu_8A {
    private String Ten;

    public ViDu_8A(String ten) {
        Ten = ten;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }
    public int tinhDoDaiTen(){
        return Ten.length();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine();
        ViDu_8A obj = new ViDu_8A(ten);
        System.out.println("Tên "+ ten + ", ki tu " + obj.tinhDoDaiTen());
    }
}
