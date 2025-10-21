public class ViDu_5A {
    private static int Tuoi;

    public ViDu_5A(int tuoi) {
        Tuoi = tuoi;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int tuoi) {
        Tuoi = tuoi;
    }
    public static double tinhNamSinh() {
        int namHienTai = 2023;
        return namHienTai - Tuoi;
    }
}


