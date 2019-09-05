import java.util.*;
 
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nums = new int[n];
        
        for(int i = 0; i<n; i++){
            nums[i] = scan.nextInt();
        }
        
        for(int i = n-1; i>=0; i--){
            System.out.println(nums[i]);
        }
 
    }
}