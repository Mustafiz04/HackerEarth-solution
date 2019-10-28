import java.io.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0){
            String[] in = br.readLine().split(" ");
            int N = Integer.parseInt(in[0]);
            int M = Integer.parseInt(in[1]);
            if(M%N == 0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
