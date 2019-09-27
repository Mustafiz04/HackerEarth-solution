import java.util.*;

class Cd{
    public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            rotate(arr, n, k);
        }
    }

    static void rotate(int arr[], int n, int k) { 
        for (int i = 0; i < n; i += k) { 
            int left = i; 
      
            int right = Math.min(i + k - 1, n - 1); 
            int temp; 
              
            while (left < right) { 
                temp = arr[left]; 
                arr[left] = arr[right]; 
                arr[right] = temp; 
                left += 1; 
                right -= 1; 
            } 
        }
        for(int j = 0; j<n; j++){
	        System.out.print(arr[j] + " ");
	    }
	    System.out.println(" "); 
    } 
}