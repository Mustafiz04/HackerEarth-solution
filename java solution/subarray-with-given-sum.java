import java.util.*;


class Subarray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int T = sc.nextInt();
    
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int s = sc.nextInt();
    
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            findSubArray(n, s, arr);
        }
    }
    
    private static void findSubArray(int n, int s, int[] arr) {
        int f = 0;
        int l = 0;
    
        long totalSum = arr[f];
    
        while (totalSum != s) {
            if (totalSum > s) {
                if (f == l) {
                    l++;
                    f++;
                    if (l >= n) break;
                    totalSum = arr[f];
                } else {
                    totalSum -= arr[f];
                    f++;
                }
            } else {
                l++;
                if (l < n) {
                    totalSum += arr[l];
                } else {
                    break;
                }
            }
        }
    
        if (totalSum != s) {
            System.out.println(-1);
        } else {
            System.out.println((f + 1) + " " + (l + 1));
        }
    }
}
