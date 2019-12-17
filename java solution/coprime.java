import java.io.*;
class TestClass {
    static int gcd(int a, int b) { 
        if(b == 0){
            return a;
        }else{
            return gcd(b, a%b);
        }
    } 

    static void check(int n){
        for(int i = n-2; i>0; i--){
            if(gcd(i, n) == 1){
                System.out.println(i);
                break;
            }
        }
    }

    public static void main(String args[] ) throws Exception 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        check(n);
    }
}
