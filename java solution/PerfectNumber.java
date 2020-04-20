import java.util.*;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        if(isPerfect(number)){
            System.out.println("The number "+number +" is perfect number");
        }else{
            System.out.println("The number "+number +" is not perfect number");
        }
    }

    static boolean isPerfect(int n) { 
        int sum = 1; 
        for(int i = 2; i * i <= n; i++) { 
            if(n % i==0) { 
                if(i * i != n) 
                    sum = sum + i + n / i; 
                else
                    sum = sum + i; 
            } 
        }  
        if (sum == n && n != 1) 
            return true; 
    
        return false; 
    } 
}