import java.io.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean flag=true;
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        char ch[] = str.toCharArray();
        for(int i=0;i<n-1;i++){
            if(ch[i]=='H' && ch[i+1]=='H'){
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("YES");
            System.out.println(str.replace('.','B'));
        }else System.out.println("NO");
    }
}