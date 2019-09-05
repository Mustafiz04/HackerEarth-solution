import java.io.*;
 
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        for(int i =0; i<N; i++){
            int total = 0;
            int a =  Integer.parseInt(br.readLine());
            for(int j = 1; j<a; j++){
                if(a%j == 0){
                    total += j;
                }
            }
            System.out.println(total);
        }
        
 
    }
}