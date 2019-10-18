<<<<<<< HEAD
import java.util.*;

class max{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = 0; i<T; i++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int j = 0; j<n; j++){
                arr[j] = sc.nextInt();
            }
            System.out.println(maxIndex(n, arr));
        }
        

    }

    public static int maxIndex(int n , int[] arr){
        int max = 0;
        int i = 0;
        while(i != n){
            for(int j = i+1; j<n; j++){
                if(arr[i] <= arr[j]){
                    int diff = j-i;
                    if(diff > max){
                        max = diff;
                    }
                }
            }
            i++;
        }

        return max;
    }
=======
import java.util.*;

class max{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = 0; i<T; i++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int j = 0; j<n; j++){
                arr[j] = sc.nextInt();
            }
            System.out.println(maxIndex(n, arr));
        }
        

    }

    public static int maxIndex(int n , int[] arr){
        int max = 0;

        // for(int i = 0; i < n-1; i++){
        //     for(int j = i+1; j<n; j++){
        //         if(arr[i] <= arr[j]){
        //             int diff = j-i;
        //             if(diff > max){
        //                 max = diff;
        //             }
        //         }
        //     }
        // }
        int i = 0;
        while(i != n){
            for(int j = i+1; j<n; j++){
                if(arr[i] <= arr[j]){
                    int diff = j-i;
                    if(diff > max){
                        max = diff;
                    }
                }
            }
            i++;
        }

        return max;
    }
>>>>>>> 366dafd5b5dc1ecafc996d94ea1eeb0ac45229e6
}