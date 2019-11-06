import java.io.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        Long a = Long.parseLong(in[0]);
        int b = Integer.parseInt(in[1]);
        String aa = Long.toString(a);
        char[] num = aa.toCharArray();
        int l = num.length;
        int i = 0,j=0;
        while(i<b && j<l){
            if(num[j] != '9'){
                num[j] = '9';
                i++;
            }
            j++;
        }
        System.out.println(num);
    }
}
