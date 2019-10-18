<<<<<<< HEAD
import java.util.*;

class Cd{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            if(palinArray(arr, n)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }

    public static boolean palinArray(int[] arr, int n){
        boolean flag = true;
        for(int i = 0 ; i < n; i++){
            if(arr[i] == reverse(arr[i])){
                flag = true;
            }else{
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static int reverse(int num){
        int rev = 0;
        while( num > 0){
            int ld = num % 10;
            rev = rev*10 +ld;
            num = num/10;
        }
        return rev;
    }


}

=======
import java.util.*;

class Cd{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            if(palinArray(arr, n)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }

    public static boolean palinArray(int[] arr, int n){
        boolean flag = true;
        for(int i = 0 ; i < n; i++){
            if(arr[i] == reverse(arr[i])){
                flag = true;
            }else{
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static int reverse(int num){
        int rev = 0;
        while( num > 0){
            int ld = num % 10;
            rev = rev*10 +ld;
            num = num/10;
        }
        return rev;
    }


}

>>>>>>> 366dafd5b5dc1ecafc996d94ea1eeb0ac45229e6
