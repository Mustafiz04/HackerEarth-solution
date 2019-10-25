import java.io.*;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        for (int i = 2; i <= N; i++) {
            boolean ch=false;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    ch=true;
                    break ;
                }
            }
            if (ch==false){
                System.out.print(i+" ");
            }
        }
    }
}
