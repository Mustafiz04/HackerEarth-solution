import java.util.*;

public class automorphicnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to be check: ");
        int number = sc.nextInt();
        if(isAutomorphic(number)){
            System.out.println("Enter "+ number + " is automorphic number");
        }else{
            System.out.println("Enter number "+ number + " is not automorphic number");
        }
    }

    static boolean isAutomorphic(int N) { 
        int sq = N * N; 
        while (N > 0) { 
            if (N % 10 != sq % 10) {
                return false; 
            }
            N /= 10; 
            sq /= 10; 
        } 
        return true; 
    } 
}