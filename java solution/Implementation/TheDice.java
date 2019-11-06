import java.io.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] num = br.readLine().toCharArray();
        int count = 0;
        int len = num.length;
        
        if(num[len-1] == '6'){
            System.out.println(-1);
        }else{
            for(int i=0; i<len; i++){
                if(num[i] == '6'){
                    count++;
                }
            }
            int actual = len-count;
            System.out.println(actual);
        }
        
    }
}
