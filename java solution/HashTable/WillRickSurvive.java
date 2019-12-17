import java.io.*;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while(n-- > 0){
            int size = Integer.parseInt(br.readLine());
            int[] arr = new int[size];
            String[] str = br.readLine().split(" ");
            for(int i = 0; i<size; i++){
                arr[i] = Integer.parseInt(str[i]);
            }
            Arrays.sort(arr);
            int dis = 1;
            int kills = 0;
            boolean alive = true;
            for(int i = 0; i<size; i++){
                if( dis > arr[i] ){
                    alive = false;
                    break;
                }else{
                    kills++;
                    dis++;
                    if( kills%6==0 ){
                        dis++;
                    }
                }
            }
            if(alive){
                System.out.println("Rick now go and save Carl and Judas");
            }else{
                System.out.println("Goodbye Rick");
                System.out.println(kills);
            }
        }
    }
}
