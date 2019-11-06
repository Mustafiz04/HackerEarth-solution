import java.io.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int node = Integer.parseInt(br.readLine());
        String[] degree = br.readLine().split(" ");
        int sum = 0;
        
        for(int i = 0; i< node; i++){
            sum += Integer.parseInt(degree[i]);
        }
        if( sum/2 == node-1 ){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}
