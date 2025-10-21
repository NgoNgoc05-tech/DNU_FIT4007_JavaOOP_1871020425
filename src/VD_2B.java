import java.util.Scanner;

class HinhVuong_2B {
    private double chieuDai;
    private double chieuRong;

    // Constructor
    public HinhVuong_2B(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    // Phương thức kiểm tra hình vuông
    public boolean laHinhVuong() {
        return chieuDai == chieuRong;
    }

    // Hàm main để chạy chương trình
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chiều dài: ");
        double dai = scanner.nextDouble();

        System.out.print("Nhập chiều rộng: ");
        double rong = scanner.nextDouble();

        HinhVuong_2B hinh = new HinhVuong_2B(dai, rong);

        if (hinh.laHinhVuong()) {
            System.out.println("Hình chữ nhật này là hình vuông.");
        } else {
            System.out.println("Hình chữ nhật này không phải là hình vuông.");
        }
    }
}