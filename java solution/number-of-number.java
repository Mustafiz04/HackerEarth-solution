<<<<<<< HEAD
import java.util.*;

class Number{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		
		int testcase = sc.nextInt();
		
		while(testcase-- > 0){
            int n = sc.nextInt();
		    int a[] = new int[n];
		    
		    for(int i = 0; i<n ;i++){
		        a[i] = sc.nextInt();
            }
            int k = sc.nextInt();
		    System.out.println(totalNUmber(a, n, k));
		}
    }

    public static int totalNUmber(int[] arr, int n, int k){
        int total = 0;
        for(int i = 0; i<n; i++){
            int a = arr[i];
            // int l = String.valueOf(a).length();
            do{
                int currentDigit = a%10;
                if( currentDigit == k){
                    total++;
                }
                a = a/10;
            }while(a>0);
        }
        return total;
    }

=======
import java.util.*;

class Number{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		
		int testcase = sc.nextInt();
		
		while(testcase-- > 0){
            int n = sc.nextInt();
		    int a[] = new int[n];
		    
		    for(int i = 0; i<n ;i++){
		        a[i] = sc.nextInt();
            }
            int k = sc.nextInt();
		    System.out.println(totalNUmber(a, n, k));
		}
    }

    public static int totalNUmber(int[] arr, int n, int k){
        int total = 0;
        for(int i = 0; i<n; i++){
            int a = arr[i];
            // int l = String.valueOf(a).length();
            do{
                int currentDigit = a%10;
                if( currentDigit == k){
                    total++;
                }
                a = a/10;
            }while(a>0);
        }
        return total;
    }

>>>>>>> 366dafd5b5dc1ecafc996d94ea1eeb0ac45229e6
}