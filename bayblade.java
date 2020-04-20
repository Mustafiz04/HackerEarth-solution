import java.util.*;
import java.io.*;

public class bayblade {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            int[] teamG = new int[n];
            String tg[] = br.readLine().split(" ");
            int[] teamB = new int[n];
            String tb[] = br.readLine().split(" ");
            for(int i = 0; i<n; i++){
                teamG[i] = Integer.parseInt(tg[i]  );
            }
            for(int i = 0; i<n; i++){
                teamB[i] = Integer.parseInt(tb[i]);
            }

            Arrays.sort(teamG);
            Arrays.sort(teamB);

            int g = n-1;
            int b = n-1;
            int total = 0;
            while( b != -1){
                if(teamG[g] <= teamB[b] ){
                    b--;
                }
                if( teamG[g] > teamB[b] ){
                    total++;
                    b--;
                    g--;
                }
            }
            System.out.println(total);
        }
    }
}