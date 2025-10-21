import java.util.Scanner;

public class Tuoi_5A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Tuoi = sc.nextInt();

        int namsinh = (int)ViDu_5A.tinhNamSinh();
        System.out.println("Tuoi: " + namsinh);
    }
}
