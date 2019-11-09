import java.util.*;
import java.io.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] a1 = br.readLine().split(" ");
        String[] a2 = br.readLine().split(" ");
        
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        
        for(int i = 0; i<n; i++){
            arr1[i] = Integer.parseInt(a1[i]);
            arr2[i] = Integer.parseInt(a2[i]);
        }
        
        int sum1 = 0, sum2 = 0, summinus1 = 0,summinus2 = 0, count = 0;
        for(int i = 0; i<n; i++){
            if(arr1[i] != -1 ){
                sum1 += arr1[i];
            }else{
                summinus1++;
            }
            if(arr2[i] != -1 ){
                sum2 += arr2[i];
            }else{
                summinus2++;
            }
        }
        
        if( sum1 == sum2 || summinus1 == summinus2 ){
            System.out.println("Infinite");
        }else if( summinus1 > 1 || summinus2 > 1 ){
            if( (summinus1 >1 && sum1 <= sum2)||(summinus2 >1 && sum2 <= sum1) ) {
                System.out.println(Math.abs(sum1-sum2) + 1 );
            }else{
                System.out.println(0);
            }
        }else{
            if(Math.abs(summinus1 - summinus2) == 1 ){
                if( summinus1 >=1 && sum1<=sum2 ){
                    count++;
                }else if( summinus2 >= 1 && sum2 <= sum1 ){
                    count++;
                }
            }
            System.out.println(count);
        }
        
    }
}
