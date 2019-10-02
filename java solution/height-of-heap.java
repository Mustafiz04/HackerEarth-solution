import java.util.*;


class GFG {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int TestCase = sc.nextInt();
	    
	    while(TestCase-- > 0){
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        for(int i = 0; i<n ; i++){
	            arr[i] = sc.nextInt();
	        }
	        System.out.println(height(arr, n));
 	    }
	}
	
	public static int height(int[] arr, int n){
	    int height = 0;
	    do{
	        height++;
	        n /= 2;
	    }while(n/2 != 0);
	    return height;
	}
}