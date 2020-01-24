import java.io.*;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());;
        int[] groza = new int[N+1];
        int[] akm = new int[N+1];
        int[][] matrix = new int[N][N];
        for(int i = 0; i<N; i++){
            String[] in = br.readLine().split(" ");
            for(int j = 0; j<N; j++){
                matrix[i][j] = Integer.parseInt(in[j]);
            }
        }
        int Q = Integer.parseInt(br.readLine());;
        while(Q-- > 0){
            String[] qu = br.readLine().split(" ");
            int type = Integer.parseInt(qu[0]);
            int a = Integer.parseInt(qu[1]);
            int b = Integer.parseInt(qu[2]);
            int c = Integer.parseInt(qu[3]);
            if(type ==1 ){
                akm[a-1] = akm[a-1]^c;
                akm[b] = akm[b]^c;
            }
            if(type == 2 ){
                groza[a-1] = groza[a-1]^c;
                groza[b] = groza[b]^c;
            }
        }
        for(int i= 1; i<N; i++){
            akm[i] = akm[i-1]^akm[i];
        }
        for(int i= 1; i<N; i++){
            groza[i] = groza[i-1]^groza[i];
        }
        for(int i= 0; i<N; i++){
            for(int j = 0 ; j<N; j++){
                matrix[i][j]^=akm[i];
            }
        }
        for(int i= 0; i<N; i++){
            for(int j = 0 ; j<N; j++){
                matrix[i][j]^=groza[i];
            }
        }
        int sum = 0;
        for(int i= 0; i<N; i++){
            sum+=matrix[i][i];
        }
        System.out.println(sum);
    }
}
