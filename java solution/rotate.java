import java.util.*;

class Rotate{

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		
		int testcase = sc.nextInt();
		
		while(testcase-- > 0){
            int n = sc.nextInt();
		    int a[] = new int[n];
		    int d = sc.nextInt();
		    for(int i = 0; i<n ;i++){
		        a[i] = sc.nextInt();
            }
		    rotateArray(a, n, d);
		}
    }

    public static void rotateArray(int[] arr, int n, int d){
        // int[] arr2 = new int[n];
        // for (int i = 0; i < n; i++) {
        //     arr2[i] = arr[d%n]; 
        //     d++;
        // }
        // for (int i = 0; i < n; i++) {
        //     System.out.print(arr2[i] + " ");            
        // }
        int temp;
        for (int i = 0; i < d; i++) {
            temp = arr[0];
            for (int j = 0; j < n-1; j++) {
                arr[j] = arr[j+1];
            }
            arr[n-1] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");            
        }
    }
}