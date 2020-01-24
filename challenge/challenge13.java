import java.util.*;

class Challenge{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(maxSubArraySumNegative(arr, n));
    }

    // Kadane's Algorithm
    public static int maxSubArraySum(int[] arr, int n) {
        int max_so_far = 0;
        int max_sum = 0;

        for(int i = 0; i<n; i++){
            max_sum = max_sum + arr[i];
            if(max_sum < 0){
                max_sum = 0;
            }else if( max_so_far < max_sum ){
                max_so_far = max_sum;
            }
        }
        return max_so_far;
    }

    // Kadane’s Algorithm: using Dynamic Programming
    public static int maxSubArraySumNegative(int[] arr, int n) {
        int max_so_far = arr[0];
        int max_sum = arr[0];

        for(int i = 1; i<n; i++){
            max_sum = Math.max(arr[i], max_sum + arr[i]);
            max_so_far = Math.max(max_so_far, max_sum);
        }
        return max_so_far;
    }
}