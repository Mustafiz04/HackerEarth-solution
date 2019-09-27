import java.util.*;

class Sum{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,1,3};
        System.out.println(sumOf(arr, 5));
    }

    public static int sumOf(int[] arr, int n){
        int total = 0;

        for(int i = 0; i<n-1; i++){
            for(int j = i+1; j<n; j++){
                int diff = arr[j] - arr[i];
                if(Math.abs(diff) > 1 ){
                    total += diff;
                }else{
                    total += 0;
                }
            }
        }
        return total;
    }
}