import java.io.*;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        
        int truck = 0;
        int space = 0;
        while(l>0 || m>0 || n>0 ){
            if( n>0 ){
                truck++;
                n--;
            }
            if(l>0 || m>0){
                if(Math.abs(l-m) <= 1 ){
                    space+=2;
                    l--;
                    m--;
                }else{
                    if( l>0 ){
                        space++;
                        l--;
                    }
                    if(m>0){
                        space++;
                        m--;
                    }
                }
            }
        }
        truck+=space/k;
        System.out.println(truck);
    }
}
