import java.io.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        while(test-- > 0){
            String[] input = br.readLine().split(" ");
            String s = input[0];
            int k = Integer.parseInt(input[1]);
            int l = s.length();
            int q = l/k;
            int r = l%k;
            if(r == 0){
                q--;
            }
            if( q+1 >= k ){
                if( r>=k-1 && r<=k || r == 0 ){
                    String sub = "";
                    int z,j;
                    for(z = 0,j = 0;z<q;z++,j+=k){
						sub += s.substring(j,j+k);
						sub += "-";
					}
                    sub += s.substring(j);
                    System.out.println(sub);
                }else{
                    System.out.println(-1);
                }
            }else{
                System.out.println(-1);
            }
        }
    }
}
