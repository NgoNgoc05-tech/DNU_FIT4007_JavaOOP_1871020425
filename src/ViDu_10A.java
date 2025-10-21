import java.util.Scanner;

public class ViDu_10A {
    private char ch;

    public ViDu_10A(char ch) {
        this.ch = ch;
    }

    public char getCh() {
        return ch;
    }

    public void setCh(char ch) {
        this.ch = ch;
    }
    public char kiTuKe(){
        return (char)(ch + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        ViDu_10A kt = new ViDu_10A(ch);
        System.out.println(""+kt.kiTuKe());
    }
}
