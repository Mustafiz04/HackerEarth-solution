import java.util.*;
 
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test!=0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
 
            int[] arr = new int[n];
 
            for(int i = 0; i< n; i++){
                arr[i] = scan.nextInt();
            }
 
            Arrays.sort(arr);
 
            if(arr[0]>=k){
                System.out.println(0);
            }else{
                int result = k-arr[0];
                System.out.println(result);
            }
            test--;
        }
    }
}