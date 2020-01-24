import java.io.*;
 
class TestClass {
    public static void main(String args[] ) throws Exception {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());                 // Reading input from STDIN
        // br.nextLine();
        String s = br.readLine();
        String s1[] = s.split(" ");
        for(int i=0;i<n;i++){
            long x = Long.parseLong(s1[i]);
            long bits = log2n(x);
            long sum=0;
            
            // System.out.println(" bits "+bits);
            while(x!=0){
                x= x&(x-1);
                sum+=(1l<<bits);
                
            // System.out.println(" sum "+sum);
                bits--;
            }
            
            System.out.print(sum+" ");
        }
        // long n = 10;
        // System.out.println(log2n(n));
    }
     static long  log2n(long n) 
    { 
        return (long)(Math.log(n)/Math.log(2));
    } 
}