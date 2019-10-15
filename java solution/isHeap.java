import java.util.*;



class GFG {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int T = sc.nextInt();
	    while(T-- > 0){
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        for(int i = 0; i < n; i++){
	            arr[i] = sc.nextInt();
	        }
	        if(isHeap(arr, n)){
	            System.out.println(1);
	        }else{
	            System.out.println(0);
	        }
	    }
	}
	
	static boolean isHeap(int arr[], int n) { 
        
        boolean is = true;
        for(int i = 0 ; i<= Math.abs((n-2)/2) ; i++){
            if( (arr[i] >= arr[2*i + 1] ) && (arr[i] >= arr[2*i+2]) ){
                is = true;
            }else{
                is = false;
                break;
            }
        }
        return is;

	}
	
}