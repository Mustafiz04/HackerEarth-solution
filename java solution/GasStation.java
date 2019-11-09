import java.io.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        int n = Integer.parseInt(a[0]);
        int x = Integer.parseInt(a[1]);
        
        String[] val = br.readLine().split(" ");
        
        int sum = 1;
        for(int i = 0; i<n; i++){
            x = x - Integer.parseInt(val[i]);
            if( x > 0){
                sum++;
            }else{
                break;
            }
        }
        System.out.println(sum);
    }
}
