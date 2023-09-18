import java.util.Scanner;

public class BTH4 {
    public static void main(String[] args) {
        System.out.println("1. từ F sang C:");
        System.out.println("2. từ C sang F:");
        System.out.println("0. Thoát");
        int choice = new Scanner(System.in).nextInt();
        switch (choice){
            case 1:
                fToC();
                break;
            case 2:
                cToF();
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("không hợp lệ");
                break;

        }
    }
    public static void fToC(){
        System.out.println("Nhập giá trị quy đổi :");
        int i = new Scanner(System.in).nextInt();
        System.out.println(i + " F = "+ ((i - 32) * 5 / 9) + "C");
    }
    public static void cToF(){
        System.out.println("Nhập giá trị quy đổi :");
        int i = new Scanner(System.in).nextInt();
        System.out.println(i + " C = "+ ((i * 9 / 5) + 32) + "F");
    }
}
