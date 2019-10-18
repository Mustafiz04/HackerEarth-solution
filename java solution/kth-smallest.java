<<<<<<< HEAD
import java.util.*;


class Kth{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
    
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            
    
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            int k = sc.nextInt();
            System.out.println(kthSmallest(arr, k));
        }
    }

    public static int kthSmallest(int[] arr, int k){
        Arrays.sort(arr);
        return arr[k-1];
    }
}
=======
import java.util.*;


class Kth{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
    
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            
    
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            int k = sc.nextInt();
            System.out.println(kthSmallest(arr, k));
        }
    }

    public static int kthSmallest(int[] arr, int k){
        Arrays.sort(arr);
        return arr[k-1];
    }
}
>>>>>>> 366dafd5b5dc1ecafc996d94ea1eeb0ac45229e6
