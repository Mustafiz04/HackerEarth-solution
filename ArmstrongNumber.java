import java.util.*;

class ArmstrongNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        if( isArmstrong(n) ){
            System.out.println("Number " + n + " is Armstrong Number");
        }else{
            System.out.println("Number " + n + " is not a Armstrong Number");
        }
    }

    public static boolean isArmstrong(int n) {
        int x = order(n); 
        int temp = n, sum=0; 
        while (temp!=0) { 
            int r = temp%10; 
            sum = sum + power(r,x); 
            temp = temp/10; 
        } 
  
        // If satisfies Armstrong condition 
        return (sum == n);
    }
    
    public static int order(int n) { 
        int x = 0; 
        while(n != 0) { 
            x++; 
            n = n/10; 
        } 
        return x; 
    } 
    public static int power(int x, long y) { 
        if( y == 0) 
            return 1; 
        if (y%2 == 0) 
            return power(x, y/2)*power(x, y/2); 
        return x*power(x, y/2)*power(x, y/2); 
    } 
}