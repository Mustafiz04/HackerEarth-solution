
import java.util.*;

class TestClass {
    int sort(int arr[]){
       int total = 0;
       int len = arr.length;
       for(int i = 0; i<len-1; i++){
           for(int j = 0 ; j<len-i-1; j++){
               if(arr[j] > arr[j+1] ){
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
                   total++;
               }
           }
       }
       return total;
    }
    
    
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        TestClass t = new TestClass();
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        int re = t.sort(arr);
        System.out.println(re);
    }
}
