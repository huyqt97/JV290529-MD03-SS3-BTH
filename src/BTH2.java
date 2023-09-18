import java.util.Scanner;

public class BTH2 {
    public static void main(String[] args) {
        String[] arr = {"arr", "arr1", "arr2", "arr3", "arr4", "arr5", "arr6"};
        Scanner sc = new Scanner(System.in);
        System.out.println("search :");
        String t = sc.nextLine();
        boolean is = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains(t)) {
                System.out.println(arr[i]);
                is = true;
            }
        }
        if(!is){
            System.err.println("ff");
        }
    }
}
