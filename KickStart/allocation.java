import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 1; i<=t; i++){
            int N = sc.nextInt();
            int B = sc.nextInt();
            int[] cost = new int[N];
            for(int j = 0; j<N; j++){
                cost[j] = sc.nextInt();
            }
            Arrays.sort(cost);
            int max = 0;
            int count = 0;
            for(int k = 0; k<N; k++){
                max += cost[k];
                count++;
                if( max > B ){
                    count--;
                    break;
                }
            }
            System.out.println("Case #" + i + " : " + count);
        }
    }
}
