import java.util.*;

class Neonnumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int sqr = num*num;
        int sum = 0;

        while(sqr > 0){
            sum += sqr % 10;
            sqr /= 10;
        }

        if(sum == num){
            System.out.println(num + " is a neon number");
        }else{
            System.out.println(num + " is not a neon number");
        }
    }
}