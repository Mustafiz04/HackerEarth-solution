import java.io.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] q = br.readLine().split(" ");
        int ic = Integer.parseInt(q[0]);
        int jc = Integer.parseInt(q[1]);
        int P = Integer.parseInt(q[2]);
        board(N,ic,jc,P);
    }
    
    public static void board(int N, int ic, int jc, int P){
        int[][] b = new int[N][N];
        b[ic][jc] = P;
        for(int i=0;i<N;i+=1) {
            for(int j=0;j<N;j+=1) {
                int dist = Math.max(Math.abs(ic-i),Math.abs(jc-j));
                if(dist>P)
                    b[i][j] = 0;
                else
                    b[i][j] = P-dist;
            }
        }
        for(int i=0;i<N;i+=1) {
            for(int j=0;j<N;j+=1) {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
}
