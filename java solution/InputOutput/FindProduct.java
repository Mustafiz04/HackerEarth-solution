import java.io.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        String num = br.readLine();
        int[] arr = new int[l];
        String[] s1 = num.split(" ");
        long ans = 1;
        int m = (int)Math.pow(10,9)+7;
        for(int i = 0; i<l; i++){
            arr[i] = Integer.parseInt(s1[i]);
            ans = ( ans * arr[i] )%m;
        }
        System.out.println(ans);
    }
}
