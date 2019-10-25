import java.util.*;
import java.math.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            System.out.print(fab(a, b, n ));
        }
    }
    
    public static int xorFab(int a, int b, int n){
        for(int i = 3; i <= n; i++){
            int next = a^b;
            b = next;
            a = b;
        }
        if(b <= 3){
            return ~(~b);
        }else{
            return b;
        }
    }

    public static int xnorFab(int a, int b, int n){
        for(int i = 3; i<=n; i++){
            int next = xnor(a,b);
            b = next;
            a = b ;
        }
        if(b <= 3){
            return ~(~b);
        }else{
            return b;
        }
    }


    public static int xnor(int a, int b) { 
        if (a < b) { 
            int t = a; 
            a = b; 
            b = t; 
        } 
  
        if (a == 0 && b == 0) 
            return 1; 
 
        int a_rem = 0;  

        int b_rem = 0;  

        int count = 0; 

        int xnornum = 0;  

        while (true) { 
            a_rem = a & 1;  
            b_rem = b & 1;  
            if (a_rem == b_rem) 
                xnornum |= (1 << count); 
            count++;  
            a = a >> 1; 
            b = b >> 1; 
            if (a < 1) 
                break; 
        } 
        return xnornum; 
    }

    public static int fab(int a, int b, int n){
        int xnor = xnorFab(a, b, n);
        int xor = xorFab(a, b, n);
        return Math.max(xor, xnor);
    }


  
}
