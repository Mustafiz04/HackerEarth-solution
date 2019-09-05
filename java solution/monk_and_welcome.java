import java.util.*;
 
 
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
    
        for(int i=0; i<n; i++){
            arr1[i] = scan.nextInt();
        }
        
        for(int i=0; i<n; i++){
            arr2[i] = scan.nextInt();
        }
        
        int[] a = new int[n];
        
        for(int i=0; i<n; i++){
            a[i] = arr1[i] + arr2[i];
        }
 
        for(int i=0; i<n; i++){
            System.out.print(a[i] + " ");
        }
        
        
    }
}