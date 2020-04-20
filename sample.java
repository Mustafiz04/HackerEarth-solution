import java.util.*;

public class sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = n - 1;

        int number = 0;
        
        for(int i=1; i<=n; i++){
            number = i;
            for(int s =space; s>=i; s--){
                System.out.print("  ");
            }
            for(int num = 1; num<=i; num++){
                System.out.print(number + " ");
                number--;
            }
            System.out.println();
        }

    }
}