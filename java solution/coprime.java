import java.io.*;
 
class TestClass {
 
    
    static int gcd(int a, int b) 
    { 
        // Everything divides 0  
        if (a == 0) 
          return b; 
        if (b == 0) 
          return a; 
       
        // base case 
        if (a == b) 
            return a; 
       
        // a is greater 
        if (a > b) 
            return gcd(a-b, b); 
        return gcd(a, b-a); 
    } 
 
    static void check(int n){
        for(int i = n-2; i>0; i--){
            if(gcd(i, n) == 1){
                System.out.println(i);
                break;
            }
        }
    }
 
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        // System.out.println(gcd(6,n));
 
        // int x = n-2;
        check(n);
    }
}