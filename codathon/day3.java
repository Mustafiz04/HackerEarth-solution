import java.io.*;
import java.util.*;

class TestClass {
    public static int fact(int n){
        if(n == 0){
            return 1;
        }else{
            return n*fact(n-1);
        }
    }

    static void combinationUtil(int arr[], int data[], int start, int end, int index, int r) {  
        if (index == r) { 
            for (int j=0; j<r; j++) 
                System.out.print(data[j]+" "); 
            System.out.println(""); 
            return; 
        }  
        for (int i=start; i<=end && end-i+1 >= r-index; i++) { 
            data[index] = arr[i]; 
            combinationUtil(arr, data, i+1, end, index+1, r); 
        } 
    }
      
    static void printCombination(int arr[], int n, int r) {  
        int data[]=new int[r]; 
        combinationUtil(arr, data, 0, n-1, 0, r); 
    } 


    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        int n = Integer.parseInt(in[0]);
        int m = Integer.parseInt(in[1]);
        int l = Integer.parseInt(in[2]);
        int[] cost = new int[l];
        String[] c = br.readLine().split(" ");
        for(int i = 0; i<l; i++){
            cost[i] = Integer.parseInt(c[i]);
        }
        int compos = 0;
        int sinpos = 0;
        Arrays.sort(cost);
        if( cost[0] > m ){
            System.out.println(0);
        }else{
            for(int i = 0; i<=l-n; i++){
                int total = 0;
                int rem = 0;
                for(int j = i; j<l; j++){
                    total += cost[j];
                    rem++;
                    if(rem == n){
                        break;
                    }
                }
                if( total % m == 0){
                    compos++;
                }
            }
            for(int i = 0; i<l; i++){
                // if(cost[i] == m ){
                //     sinpos++;
                // }
                if( n*cost[i] >= m && (n*cost[i])%m == 0 ){
                    sinpos++;
                }
            }
        }
        System.out.println(compos*fact(n) + sinpos);
    }
}