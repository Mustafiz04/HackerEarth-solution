import java.io.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        long sum1 = 0, sum2 = 0,sum3 = 0;
        int[] num = new int[n];

        String[] in = br.readLine().trim().split(" ");

        for(int i = 0; i<n; i++){
            if(count%3 == 0){
                sum1 += Integer.parseInt(in[i]);
            }else if(count%3 == 1){
                sum2 += Integer.parseInt(in[i]);
            }else{
                sum3 += Integer.parseInt(in[i]);
            }
            count++;
        }
        System.out.println(sum1+" "+sum2+" "+sum3);
    }
}
