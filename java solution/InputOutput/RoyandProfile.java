import java.io.*;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in); 
        
        int L = sc.nextInt();
        int n = sc.nextInt();
        while(n-- > 0){
            int w = sc.nextInt();
            int h = sc.nextInt();
            check(w,h,L);
        }
    }
    
    public static void check(int w, int h, int L){
        if(w < L || h < L){
            System.out.println("UPLOAD ANOTHER");
        }else{
            if(h == w){
                System.out.println("ACCEPTED");
            }else{
                System.out.println("CROP IT");
            }
        }
    }
    
}
