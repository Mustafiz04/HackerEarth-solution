<<<<<<< HEAD
import java.util.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int TestCase = sc.nextInt();
	    
	    while(TestCase-- > 0){
	        int n = sc.nextInt();
	        int k = sc.nextInt();
	        int[] arr = new int[n];
	        for(int i = 0; i<n ; i++){
	            arr[i] = sc.nextInt();
	        }
	        kLargest(arr, n, k);
 	    }
	}
	
	public static void kLargest(int[] arr, int n, int k){
	    Arrays.sort(arr);
	    for(int i = 0; i < k; i++){
	        System.out.print(arr[n-1-i] + " ");
	    }
	    System.out.println();
	} 
	
=======
import java.util.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int TestCase = sc.nextInt();
	    
	    while(TestCase-- > 0){
	        int n = sc.nextInt();
	        int k = sc.nextInt();
	        int[] arr = new int[n];
	        for(int i = 0; i<n ; i++){
	            arr[i] = sc.nextInt();
	        }
	        kLargest(arr, n, k);
 	    }
	}
	
	public static void kLargest(int[] arr, int n, int k){
	    Arrays.sort(arr);
	    for(int i = 0; i < k; i++){
	        System.out.print(arr[n-1-i] + " ");
	    }
	    System.out.println();
	} 
	
>>>>>>> 366dafd5b5dc1ecafc996d94ea1eeb0ac45229e6
}