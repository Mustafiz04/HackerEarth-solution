import java.util.Scanner;

public class Main{            
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for (int i = 0; i <= size; i++){
            int n = size;
            for (int j = 1; j<= n - i; j++){ 
                System.out.print(" "); 
            }
            for (int k = i; k >= 0; k--){
                System.out.print(k);
            }
            for (int l = 1; l <= i; l++){ 
                System.out.print(l); 
            } 
            System.out.println(); 
        } 
    }
}