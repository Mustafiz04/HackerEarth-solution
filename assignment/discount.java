import java.text.DecimalFormat;
import java.util.*;

class Discount{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of products purchased > ");
        int n = sc.nextInt();

        int retail = 99;
        int purcase = 0;
        int p = 0;
        if( n >= 1 && n <= 9  ){
            purcase = n*retail;
        }else if( n >= 10 && n <= 19  ){
            int a = n*99;
            p = 20;
            int d = dis(a, p);
            purcase = a -d;
        }else if( n >= 20 && n <= 49  ){
            int a = n*99;
            p = 30;
            int d = dis(a, p);
            purcase = a -d;
        }else if( n >= 50 && n <= 99  ){
            int a = n*99;
            p = 40;
            int d = dis(a, p);
            purcase = a -d;
        }else if( n >= 100  ){
            int a = n*99;
            p = 50;
            int d = dis(a, p);
            purcase = a - d;
        }
        DecimalFormat format = new DecimalFormat("0.00"); 
        System.out.println("Your purchase of " + n + " products provides a quantity discount is " + p +"%");
        System.out.println("Your total purchase price is $"+ format.format(purcase));

    }

    public static int dis(int amount, int percent){
        int d = (amount*percent)/100;
        return d;
    }
}