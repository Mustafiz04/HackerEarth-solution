import java.util.Scanner;

public class Mystery {
    public static int rev(int num) {
        int ans = 0;
        while (num > 0) {
            ans *= 10;
            ans += (num % 10);
            num /= 10;
        }
        return ans;
    }

    public static boolean solve(int num) {
        for (int i = 1; i <= num / 2; i++) {
            int j = rev(i); 
            if (i + j == num)  { 
                System.out.println( i + " " + j);  
                return true; 
            } 
        }
        return false;
    }

    public static void main(String args[]) {
        System.out.print("Enter the number: ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        if( solve(num)) {
            System.out.println( num + " is a mystery number");
        }
        else{
            System.out.println( num + " is not a mystery number");
        }
    }
}
