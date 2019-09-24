import java.util.*;

class Multiply{

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		
		int testcase = sc.nextInt();
		
		while(testcase-- > 0){
		    int n = sc.nextInt();
		    int a[] = new int[n];
		    
		    for(int i = 0; i<n ;i++){
		        a[i] = sc.nextInt();
		    }
		    System.out.println(MultiArraySum(n, a));
		}
    }

    public static int MultiArraySum(int n, int[] arr){
        int l = 0;
        int r = 0;
        for (int i = 0; i < n; i++) {
            if(i < n/2){
                l += arr[i];
            }else{
                r += arr[i];
            }
        }
        return l * r;
    }

}
