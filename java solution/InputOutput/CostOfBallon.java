import java.io.*;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int[] balloon = new int[2];
        
        for(int c=0; c<t; c++){
            for(int i=0; i<2; i++){
                balloon[i] = scan.nextInt();
            }
            int p = scan.nextInt();
    
            int[][] que = new int[p][2];
            for(int i=0; i<p; i++){
                for(int j=0; j<2; j++){
                    que[i][j] = scan.nextInt();
                }
            }
            countCost(balloon, p, que);
        }
    }

    private static void countCost(int[] balloon, int p, int[][] que){
        int c1=0, c2=0, cost=0;

        for(int i=0; i<p; i++){
            c1 += que[i][0];
            c2 += que[i][1];
        }
    
        int ans1 = c1*balloon[0] + c2*balloon[1];
        int ans2 = c1*balloon[1] + c2*balloon[0];
        if(ans1 > ans2){
            cost = ans2;
        }else{
            cost = ans1;
        }
        System.out.println(cost);
    }
}
