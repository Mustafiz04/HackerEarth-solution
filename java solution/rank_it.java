import java.util.*;
class TestClass {
    public static int binarySearch(int arr[], int x) {
        int l = 0;
        int r = arr.length-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid] == x){
                return mid;
            }else if(arr[mid] > x){
                r = mid-1;
            }else{
                l = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        TestClass bs = new TestClass();
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int t = sc.nextInt();
        for(int j = 0; j<t; j++){
            int x = sc.nextInt();
            int result = bs.binarySearch(arr, x);
            if(result>=0){
                System.out.println(result+1);
            }
        }
        

    }
}
