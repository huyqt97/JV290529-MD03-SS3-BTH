public class BTH3 {
    public static void main(String[] args) {
        int []arr = {42,53,231,352,34,2355,434,5546,546,45,52212,3122,423534,534,6546,546,45,644343};
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(max< arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
