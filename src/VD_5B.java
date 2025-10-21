import java.util.Scanner;

public class VD_5B {
    private double diem;

    public VD_5B(double diem) {
        this.diem = diem;
    }

    public boolean diemhl() {
        return diem >= 0 && diem <= 10;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int diem = scanner.nextInt();

        VD_5B vd = new VD_5B(diem);
        if (vd.diemhl()) {
            System.out.println("hop li");
        }
        else {
            System.out.println("no");
        }
    }
}
