import java.io.*;
import java.util.*;

class Nov{
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        
        String[] num = br.readLine().split(" ");
        int[] arr = new int[n];
        int[] arr2 = new int[2];
        for(int i = 0; i< n; i++){
            arr[i] = Integer.parseInt(num[i]);
        }

        int a = 0;
        Arrays.sort(arr);
        if(arr[0] != arr[1]){
            arr2[0] = arr[0];
            a++;
        }

        for(int i = 1; i< n-1; i++){
            if(arr[i] != arr[i+1] && arr[i] != arr[i-1]){
                arr2[a] = arr[i];
                a++; 
            }
            if(a > 1){
                break;
            }
        }

        if(arr[n-1] != arr[n-2]){
            arr2[1] = arr[n-1];
        }
        if(arr[0] < arr[1]){
            System.out.println(arr2[0] + " " + arr2[1]);
        }else{
            System.out.println(arr2[1] + " " + arr2[0]);
        }



    }
}