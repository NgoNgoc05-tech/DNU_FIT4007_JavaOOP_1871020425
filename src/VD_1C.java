import java.util.Scanner;

public class VD_1C {
    public static  void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        String Doc;
        switch (n){
            case 0: Doc = "Khong";
            break;
            case 1: Doc = "Tuong";
            break;
            case 2: Doc = "Khong";
            break;
            case 3: Doc = "Tuong";
            break;
            case 4: Doc = "Khong";
            break;
            case 5: Doc = "Tuong";
            break;
            case 6: Doc = "Khong";
            break;
            case 7: Doc = "Tuong";
            break;
            case 8: Doc = "Khong";
            break;
            case 9: Doc = "Tuong";
            break;
            default: Doc = "ngu";
        }
        System.out.println("Doc "+Doc);
    }
}
