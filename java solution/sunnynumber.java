import java.util.*;

public class sunnynumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        double x = Math.sqrt(n+1);
        if( (x - Math.floor(x)) == 0 ){
            System.out.println(n + " is a sunny number");
        }else{
            System.out.println(n + " is a not sunny number");
        }
    }
}