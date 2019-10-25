import java.util.*;
import java.math.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while(T-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0;i<n; i++){
                arr[i] = sc.nextInt();
            }
            System.out.print(Integer.toString(count(arr,n)) + " " );
        }
    }
    
    // public static int fact(int n){
    //     int res = 1, i; 
    //     for (i=2; i<=n; i++) 
    //         res *= i;
    //     f.add(n,res);
    //     return res;   
    // }
    
      
    static int power(int a,int n, int p) 
    { 
        // Initialize result 
        int res = 1; 
          
        // Update 'a' if 'a' >= p 
        a = a % p;  
      
        while (n > 0) 
        { 
            // If n is odd, multiply 'a' with result 
            if ((n & 1) == 1) 
                res = (res * a) % p; 
      
            // n must be even now 
            n = n >> 1; // n = n/2 
            a = (a * a) % p; 
        } 
        return res; 
    } 

    static boolean isPrime(int n, int k) 
    { 
    // Corner cases 
    if (n <= 1 || n == 4) return false; 
    if (n <= 3) return true; 
      
    // Try k times 
    while (k > 0) 
    { 
        // Pick a random number in [2..n-2]      
        // Above corner cases make sure that n > 4 
        int a = 2 + (int)(Math.random() % (n - 4));  
      
        // Fermat's little theorem 
        if (power(a, n - 1, n) != 1) 
            return false; 
      
        k--; 
        } 
      
        return true; 
    }  
    
    public static int count(int[] arr, int n){
        int c = 0;
        for(int i = 0; i<n; i++){
            // int z = arr[i];
            // int f = fact(z-1);
            if( isPrime(arr[i], 3) ){
                c++;
            }
        }
        return c;
    }
}
