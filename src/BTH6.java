import java.util.Scanner;

public class BTH6 {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập số size:");
            size = sc.nextInt();
            if (size > 30) {
                System.out.println("số học sinh không lớn hơn 30");
            }
        } while (size > 30);
        arr = new int[size];
        int count = 0;
        while (count < arr.length) {
            System.out.println("điểm học sinh thứ " + (count + 1) + " : ");
            arr[count] = sc.nextInt();
            count++;
        }
        for (int t:
             arr) {
            System.out.print(t + " ");
        }
    }
}
