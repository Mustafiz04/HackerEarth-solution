import java.io.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] q = br.readLine().split(" ");
        int N = Integer.parseInt(q[0]);
        int Q = Integer.parseInt(q[1]);
        String[] arrS = br.readLine().split(" ");
        int[] arr = new int[N];
        for(int i = 0; i<N; i++){
            arr[i] = Integer.parseInt(arrS[i]);
        }
        
        while(Q-- > 0){
            String[] query = br.readLine().split(" ");
            int a = Integer.parseInt(query[0]);
            int b = Integer.parseInt(query[1]);
            int c = Integer.parseInt(query[2]);
            
            if(a == 1){
                arr[b] = c;
            }
            if(a == 2){
                int total = 0;
                for(int i = b; i<=c; i++){
                    total += arr[i];
                }
                System.out.println(total);
            }
        }
    }
}
