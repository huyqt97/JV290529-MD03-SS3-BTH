public class BTH5 {
    public static void main(String[] args) {
        int[] arr = {213,3,434,234,325,32,5435,435,34545,65,63,2,2};
        checkArr(arr);
    }
    public static void checkArr(int [] arr){
        int min = arr[0];
        for (int t:
             arr) {
            if(min>t){
                min=t;
            }
        }
        System.out.println(min);
    }
}
