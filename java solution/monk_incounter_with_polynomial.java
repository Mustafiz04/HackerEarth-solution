import java.util.*;
class TestClass {

    public static int minX(int a, int b, int c, int k){
        int x = Integer.MAX_VALUE;
        if(k <= c){
            return 0;
        }

        int h = k-c;
        int l = 0;
        while(l<=h){
            int m = (l+h)/2;
            if((a*m*m) + (b*m) > (k-c) ){
                x = Math.min(x,m);
                h = m-1;
            }else if((a*m*m) + (b*m) < (k-c) ){
                l = m+1;
            }else{
                return m;
            }
        }
        return x;
    }



    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        TestClass t = new TestClass();

        // System.out.println(Short.MIN_VALUE);
        int n = sc.nextInt();

        for(int j = 0; j<n; j++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int k = sc.nextInt();
            int result = t.minX(a,b,c,k);
            System.out.println(result);
        }
    }
}